package com.pieroapp.passwordgen.strategy;
import com.pieroapp.passwordgen.util.RandomUtil;

public class LetterNumberStrategy implements  PasswordStrategy {
    private static final String POOL = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvwxyz" + "0123456789";

    @Override
    public String generate(int length) {
        StringBuilder sb = new StringBuilder(length);
        for(int i=0; i < length; i++) {
            int idx = RandomUtil.nextInt(POOL.length());
            sb.append(POOL.charAt(idx));


        }
        return sb.toString();
    }

}
