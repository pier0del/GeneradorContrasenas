package com.pieroapp.passwordgen.generator;

import com.pieroapp.passwordgen.strategy.PasswordStrategy;

public class PasswordGenerator {
    private final PasswordStrategy strategy;

    public PasswordGenerator (PasswordStrategy strategy) {
        this.strategy = strategy;
    }
    public String generate(int length) {
        return strategy.generate(length);

    }
}