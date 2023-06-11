package Utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Helper {
    public static int calc(int num1, int num2, char operation) {
        Scanner scanner = new Scanner(System.in);
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
                        num2 = scanner.nextInt();
                    }
                default:
                    System.out.println("Please enter a valid operation");
                    operation = scanner.next().charAt(0);
            }
        }
    }

    public static int getInt(Scanner scanner) {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

    public static char getOperation(Scanner scanner) {
        try {
            return scanner.next().charAt(0);
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }
}
