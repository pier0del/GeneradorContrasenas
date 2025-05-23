package com.pieroapp.passwordgen.strategy;

public interface PasswordStrategy {
    String generate(int length);
}