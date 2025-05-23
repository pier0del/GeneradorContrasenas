package com.pieroapp.passwordgen.strategy;
import com.pieroapp.passwordgen.util.RandomUtil;
public class SpecialCharStrategy implements PasswordStrategy {
    private static final String SPECIALS = "!@#$%^&*()-_=+[]{}|;:,.<>?";

    @Override
    public String generate(int length) {
        StringBuilder sb = new StringBuilder(length);
        for(int i = 0; i < length; i++) {
            int idx =RandomUtil.nextInt(SPECIALS.length());
            sb.append(SPECIALS.charAt(idx));
        }
        return sb.toString();
    }
}
