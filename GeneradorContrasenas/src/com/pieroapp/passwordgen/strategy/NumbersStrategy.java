package com.pieroapp.passwordgen.strategy;
import com.pieroapp.passwordgen.util.RandomUtil;
public class NumbersStrategy implements PasswordStrategy {
    private static final String NUMBERS = "0123456789";

    @Override
    public String generate(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int idx = RandomUtil.nextInt(NUMBERS.length());
            sb.append(NUMBERS.charAt(idx));
        }
        return sb.toString();
    }




}
