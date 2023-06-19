package utils;

import java.util.Locale;
import java.util.Scanner;

public class Task_1 {

    public static String getString(Scanner scanner) {
        String x = scanner.nextLine();

        //charAt
        char lastChar = x.charAt(x.length() - 1);
        System.out.println(lastChar);

        //endsWith
        boolean endsWith = x.endsWith("!!!");
        System.out.println(endsWith);

        //startsWith
        boolean startsWith = x.startsWith("I like");
        System.out.println(startsWith);

        //contains
        boolean contains = x.contains("Java");
        System.out.println(contains);

        //substring 'Java' position
        int position = x.indexOf("Java");
        System.out.println(position);

        //replace
        String replace = x.replace('a', 'o');
        System.out.println(replace);

        //upperCase
        String upperCase = x.toUpperCase(Locale.ROOT);
        System.out.println(upperCase);

        //lowerCase
        String lowerCase = x.toLowerCase(Locale.ROOT);
        System.out.println(lowerCase);

        //extract substring
        String substring = x.substring(7, 11);
        System.out.println(substring);
        return x;
    }
}

