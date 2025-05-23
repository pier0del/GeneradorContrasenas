package com.pieroapp.passwordgen.util;
import java.security.SecureRandom;

public class RandomUtil {
    private static final SecureRandom RANDOM = new SecureRandom();

    public static int nextInt(int bound) {
        return RANDOM.nextInt(bound);
    }

}
