package com.cheddarflow.model;

import java.util.Optional;

@FunctionalInterface
public interface HasOptionsContract {

    Optional<OptionsContract> getActiveContract();
}
