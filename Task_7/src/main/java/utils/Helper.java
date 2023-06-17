package utils;

import java.util.Scanner;

public class Helper {
    public static int calc(int num1, int num2, char operation, Scanner scanner) {
        while (true) {
            switch (operation) {
                case '+':
                    return num1 + num2;
                case '-':
                    return num1 - num2;
                case '*':
                    return num1 * num2;
                case '/':
                    if (num2 != 0) {
                        return num1 / num2;
                    } else {
                        System.out.println("Division by " + num2 + " is not allowed");
                        System.out.println("Please enter a different num2");
                        num2 = getInt(scanner);
                    }
                default:
                    System.out.println("Please enter a valid operation");
                    operation = scanner.next().charAt(0);
            }
        }
    }

    public static int getInt(Scanner scanner) {
        boolean num = scanner.hasNextInt();
        while (true) {
            if (num) {
                return scanner.nextInt();
            } else {
                System.out.println("Please enter number");
                scanner.next();
            }
            num = scanner.hasNextInt();
        }
    }

    public static char getOperation(Scanner scanner) {
        return scanner.next().charAt(0);
    }


}
