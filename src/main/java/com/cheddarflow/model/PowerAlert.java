package com.cheddarflow.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Date;
import java.util.Optional;

import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutablePowerAlert.class)
@JsonDeserialize(as = ImmutablePowerAlert.class)
public interface PowerAlert extends SymbolSpecific, Created, Updated {

    Optional<Long> getId();
    Date getAlertDate();
    @JsonProperty("putSeen")
    boolean isPutSeen();
    float getFirstSpot();
    Optional<Float> getFirstVolume();
    Optional<Float> getVolumeDelta();
    int getNumCalls();
    Optional<Integer> getNumImpliedVolatilityMatches();
    Optional<Integer> getNumUnusual();
    Optional<Integer> getNumHighlyUnusual();
    Optional<Integer> getNumDarkPool();

    @JsonIgnore
    default boolean isPureFlow() {
        return this.getNumCalls() > 2 && !this.isPutSeen();
    }

    @JsonIgnore
    default boolean isPureFlowBroken() {
        return this.getNumCalls() > 2 && this.isPutSeen();
    }

    @JsonProperty("broken")
    default boolean isBroken() {
        final int num = this.getNumCalls();
        return this.isPutSeen() || (num > 2 && num != this.getNumImpliedVolatilityMatches().orElse(0));
    }

    default int getStrength() {
        final int numCalls = this.getNumCalls();
        final int numUnusual = this.getNumUnusual().orElse(0);
        final int numHighlyUnusual = this.getNumHighlyUnusual().orElse(0);
        final int numDarkPool = this.getNumDarkPool().orElse(0);
        final int numIvol = this.getNumImpliedVolatilityMatches().orElse(0);
        if (numCalls > 2 || numHighlyUnusual > 0 || numUnusual > 2) {
            if (numIvol == numCalls) {
                if ((numCalls > 9 && numDarkPool > 3) || (numCalls > 7 && numHighlyUnusual > 0)) {
                    return 9; //was 100 %
                } else if (numCalls > 6 && numDarkPool > 1) {
                    return 7; //was 85 %
                } else if (numCalls > 6) {
                    return 6; //was 75 %
                } else if (numCalls > 4 && numUnusual > 0) {
                    return 3; //was 45 %
                } else if (numCalls > 2) {
                    return 2; //was 35 %
                }
            } else if (numCalls > 2) {
                return 1; // pure flow > 2 calls not broken
            }
        }
        return 0; //was 0 %
    }
}
