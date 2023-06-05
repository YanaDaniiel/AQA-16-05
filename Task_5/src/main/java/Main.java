import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Task_1
        for (int i = 1000; i <= 9999; i += 3) {
            System.out.println(i);
        }

        //Task_2
        for (int i = 10; i >= -10; i -= 4) {
            if (i >= 0) {
                System.out.println(i);
            }
        }

        //Task_3
        System.out.println("Please enter positive number to calculate its factorial");
        long factorial = 1;
        int inputTask3 = scanner.nextInt();
        if (inputTask3 == 0) {
            System.out.println("The number cannot be 0");
        } else if (inputTask3 < 0) {
            System.out.println("The number cannot be negative");
        } else {
            for (int i = 1; i <= inputTask3; i++) {
                factorial *= i;
            }
            System.out.println("The " + inputTask3 + " factorial equals " + factorial);
        }


        //Task_4
        System.out.println("Please enter the number to calculate its sum of digits");
        long sum = 0;
        long inputTask4 = scanner.nextLong();
        if (inputTask4 == 0) {
            System.out.println("The number cannot be 0");
        } else if (inputTask4 < 0) {
            System.out.println("The number cannot be negative");
        } else {
            while (inputTask4 != 0) {
                sum = sum + (inputTask4 % 10);
                inputTask4 = inputTask4 / 10;

            }
            System.out.println("The number's sum of digits equals " + sum);
        }
        scanner.close();
    }
}
