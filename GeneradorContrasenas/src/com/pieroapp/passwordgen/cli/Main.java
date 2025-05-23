package com.pieroapp.passwordgen.cli;
import com.pieroapp.passwordgen.model.PasswordConfig;
import com.pieroapp.passwordgen.strategy.*;
import com.pieroapp.passwordgen.generator.PasswordGenerator;

public class Main {
    public static void main(String[] args) {
        if(args.length < 2) {
            System.err.println("uso: java -jar passwordgen.jar <TYPE> <LENGTH>");
            System.err.println("tipos: LETTERS, NUMBERS, SPECIALS, LETTERS_NUMBERS, NUMBERS_SPECIALS, ALL");
            System.exit(1);

        }
        String type = args[0].toUpperCase();
        int length;
        try{
            length = Integer.parseInt(args[1]);

        } catch (NumberFormatException e) {
            System.err.println("la longitud debe ser un numero entero");
            return;
        }
        PasswordStrategy strategy;
        switch (type) {
            case "LETTERS":
                strategy = new LetterStrategy();
                break;
            case "NUMBERS":
                strategy = new NumbersStrategy();
                break;
            case "SPECIALS":
                strategy = new SpecialCharStrategy();
                break;
            case "LETTERS_NUMBERS":
                strategy = new LetterNumberStrategy();
                break;
            case "NUMBERS_SPECIALS":
                strategy = new NumbersSpecialStrategy();
                break;
            case "ALL":
                strategy = new AllCharsStrategy();
                break;
            default:
                System.err.println("Tipo desconocido: " + type);
                return;
        }
        PasswordGenerator generator = new PasswordGenerator(strategy);
        String password = generator.generate(length);
        System.out.println("contraseña generada : " + password);

    }
}
