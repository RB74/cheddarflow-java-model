package com.cheddarflow.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Optional;

import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutablePowerAlertInput.class)
@JsonDeserialize(as = ImmutablePowerAlertInput.class)
public interface PowerAlertInput extends SymbolSpecific, Created, DatasetProvider {

    boolean isUnusual();
    boolean isHighlyUnusual();
    Optional<Float> getSpot();
    Optional<Double> getVolume();
    Optional<OptionType> getOptionType();

    static PowerAlertInput of(MarketData data) {
        return ImmutablePowerAlertInput.builder()
          .symbol(data.getSymbol())
          .createdOn(data.getTimestamp())
          .dataset(data.getDataset())
          .isUnusual(data.isUnusual())
          .isHighlyUnusual(data.isHighlyUnusual())
          .spot((float)data.getSpot())
          .volume(data.getVolume())
          .optionType(OptionType.forString(data.getOptionType()))
          .build();
    }

    static PowerAlertInput of(DXTimeAndSale data) {
        return ImmutablePowerAlertInput.builder()
          .symbol(data.getSymbol())
          .createdOn(data.getCreatedOn())
          .dataset(data.getDataset())
          .isUnusual(false)
          .isHighlyUnusual(false)
          .volume(data.getSize())
          .spot(Optional.empty())
          .build();
    }
}
