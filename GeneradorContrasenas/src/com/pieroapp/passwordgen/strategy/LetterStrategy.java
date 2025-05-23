package com.pieroapp.passwordgen.strategy;
import com.pieroapp.passwordgen.util.RandomUtil;
public class LetterStrategy implements PasswordStrategy {
    private static final String LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrtuvwxyz";

    @Override
    public  String generate(int length) {
        StringBuilder sb = new StringBuilder(length);
        for(int i = 0; i < length; i++) {
            int idx = RandomUtil.nextInt(LETTERS.length());
            sb.append(LETTERS.charAt(idx));

        }
        return sb.toString();

    }

}
