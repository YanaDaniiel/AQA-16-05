package com.hillel;

import utils.Task_1;
import utils.Task_2;
import utils.Task_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the string");
        Task_1.getString(scanner);

        System.out.println("Please enter the values subsequently: surname, mark and subject");
        String surname = scanner.nextLine();
        String mark = scanner.nextLine();
        String subject = scanner.nextLine();
        Task_2.getMarks(surname, mark, subject);

        String symbols = scanner.nextLine();
        Task_3.findMinString(symbols);

    }
}