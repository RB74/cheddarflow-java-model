package com.cheddarflow.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Optional;

import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutablePowerAlertInput.class)
@JsonDeserialize(as = ImmutablePowerAlertInput.class)
public interface PowerAlertInput extends SymbolSpecific, Created, HasOptionsContract, DatasetProvider {

    boolean isUnusual();
    boolean isHighlyUnusual();
    Optional<Float> getSpot();
    Optional<OptionType> getOptionType();

    static PowerAlertInput of(MarketData data) {
        return ImmutablePowerAlertInput.builder()
          .symbol(data.getSymbol())
          .createdOn(data.getTimestamp())
          .activeContract(data.getActiveContract())
          .dataset(data.getDataset())
          .isUnusual(data.isUnusual())
          .isHighlyUnusual(data.isHighlyUnusual())
          .spot((float)data.getSpot())
          .optionType(data.getActiveContract().map(OptionsContract::getType))
          .build();
    }

    static PowerAlertInput of(DXTimeAndSale data) {
        return ImmutablePowerAlertInput.builder()
          .symbol(data.getSymbol())
          .createdOn(data.getCreatedOn())
          .dataset(data.getDataset())
          .isUnusual(false)
          .isHighlyUnusual(false)
          .spot(Optional.empty())
          .build();
    }
}
