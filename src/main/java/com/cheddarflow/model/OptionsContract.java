package com.cheddarflow.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Date;

import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableOptionsContract.class)
@JsonDeserialize(as = ImmutableOptionsContract.class)
public interface OptionsContract extends SymbolSpecific {

    Date getExpiration();
    float getStrike();
    OptionType getType();
}
