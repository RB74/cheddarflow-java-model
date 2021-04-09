package com.cheddarflow.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Date;
import java.util.Optional;

import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutablePowerAlert.class)
@JsonDeserialize(as = ImmutablePowerAlert.class)
public interface PowerAlert extends SymbolSpecific, Created, Updated, HasOptionsContract {

    Optional<Long> getId();
    Date getAlertDate();
    @JsonProperty("broken")
    boolean isBroken();
    int getStrength();
    Optional<Integer> getStrengthIncrease();
    float getFirstSpot();
    Optional<Float> getFirstVolume();
    Optional<Float> getVolumeDelta();
    int getNumCalls();
    Optional<Integer> getNumUnusual();
    Optional<Integer> getNumHighlyUnusual();
    Optional<Integer> getNumDarkPool();
}
