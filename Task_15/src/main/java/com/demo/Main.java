package com.demo;

import com.utils.LoginUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter login");
        String login = scanner.nextLine();
        System.out.println("Please enter password");
        String password = scanner.nextLine();
        System.out.println("Please confirm the password");
        String confirmPassword = scanner.nextLine();

        LoginUtils.loginDataChecker(login, password, confirmPassword);
    }
}
