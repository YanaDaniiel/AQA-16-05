package com.hillel;

import Utils.Helper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int x = Helper.getInt(scanner);
        System.out.println("Please enter the second number");
        int y = Helper.getInt(scanner);
        System.out.println("Please enter the operation");
        char operation = Helper.getOperation(scanner);
        int result = Helper.calc(x, y, operation);
        System.out.println(result);
        scanner.close();
    }
}
