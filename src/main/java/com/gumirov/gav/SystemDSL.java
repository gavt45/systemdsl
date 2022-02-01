package com.gumirov.gav;

import org.d0sl.domain.DomainFunction;
import org.d0sl.domain.DomainModel;

@DomainModel(name = "SystemDSL")
public class SystemDSL {
    @DomainFunction(name = "environment.get")
    public String getEnv(String key) {
        return System.getenv(key);
    }
}
