package com.hillel;

import inheritance.Eagle;
import stringBuilder.StringBuilderClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        StringBuilderClass.getBuilder(a, b);

        String[] eagleFood = new String[]{"small bird", "worm"};
        Eagle eagle = new Eagle("Petro", "brown", 10, "feather", eagleFood, "pair");
        eagle.getEagle();
    }
}