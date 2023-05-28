import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Task_1
        System.out.println("Task_1");
        int centimeter = 10;
        int dime = 25;
        float centimetersInDime = 2.54f;
        float centimeterToDime = centimeter * centimetersInDime;
        float dimeToCentimeter = dime / centimetersInDime;
        System.out.println(centimeterToDime + " dimes");
        System.out.println(dimeToCentimeter + " centimeters");

        //Task_2
        System.out.println("Task_2");
        float earnedByVasya = 5000f;
        float parentsBonus = 5000f;
        float euroCourse = 28f;
        float savingsForVacationInEuro = (earnedByVasya + parentsBonus) / euroCourse;
        System.out.println(savingsForVacationInEuro);

        //Task_3
        System.out.println("Task_3");
        System.out.println("Please enter a positive two-digit number");
        Scanner scannerTask3 = new Scanner(System.in);
        int tensTask3;
        int onesTask3;
        try {
            int inputTask3 = Integer.parseInt(scannerTask3.nextLine());
            if (inputTask3 >= 10 && inputTask3 <= 99) {
                tensTask3 = inputTask3 / 10;
                onesTask3 = inputTask3 % 10;
                System.out.println(onesTask3 + " " + tensTask3);
            } else if (inputTask3 / 10 == 0) {
                System.out.println("The two-digit number cannot start with 0 or be less than 10");

            } else {
                System.out.println("You entered non-positive or not two-digit number");
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

        //Task_4
        System.out.println("Task_4");
        System.out.println("Please enter a positive two-digit number");
        Scanner scannerTask4 = new Scanner(System.in);
        try {
            int tensTask4;
            int onesTask4;
            int inputTask4 = Integer.parseInt(scannerTask4.nextLine());
            if (inputTask4 >= 10 && inputTask4 <= 99) {
                onesTask4 = inputTask4 % 10;
                tensTask4 = inputTask4 - onesTask4;
                System.out.println(tensTask4 + "+" + onesTask4);
            } else if (inputTask4 / 10 == 0) {
                System.out.println("The two-digit number cannot start with 0 or be less than 10");

            } else {
                System.out.println("You entered non-positive or not two-digit number");
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

        //Task_5
        System.out.println("Task_5");
        System.out.println("Please enter a positive two-digit number");
        Scanner scannerTask5 = new Scanner(System.in);
        try {
            int tensTask5;
            int onesTask5;
            int inputTask5 = Integer.parseInt(scannerTask5.nextLine());
            if (inputTask5 >= 10 && inputTask5 <= 99) {
                tensTask5 = inputTask5 / 10;
                onesTask5 = inputTask5 % 10;
                System.out.println("Weight of the number: " + (tensTask5 + onesTask5));
            } else if (inputTask5 / 10 == 0) {
                System.out.println("The two-digit number cannot start with 0 or be less than 10");

            } else {
                System.out.println("You entered non-positive or not two-digit number");
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

        //Task_6
        System.out.println("Task_6");
        System.out.println("Please enter any valid number");
        Scanner scannerTask6 = new Scanner(System.in);
        try {
            int inputTask6 = Integer.parseInt(scannerTask6.nextLine());
            if (inputTask6 == 0) {
                System.out.println("Zero");
            } else if (inputTask6 > 0) {
                System.out.println("Positive");
            } else {
                System.out.println("Negative");
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

        //Task_7
        System.out.println("Task_7");
        System.out.println("Please enter any three-digit positive number");
        Scanner scannerTask7 = new Scanner(System.in);
        try {
            int inputTask7Minused;
            int inputTask7 = Integer.parseInt(scannerTask7.nextLine());
            if (inputTask7 >= 100 && inputTask7 <= 999) {
                inputTask7Minused = inputTask7 - 1;
                System.out.println(inputTask7Minused);
            } else if (inputTask7 / 100 == 0) {
                System.out.println("The three-digit number cannot start with 0 or be less than 100");

            } else {
                System.out.println("You entered non-positive or not three-digit number");
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

        //Task_8
        System.out.println("Task_8");
        System.out.println("Please enter any two-digit positive number");
        Scanner scannerTask8 = new Scanner(System.in);
        try {
            int inputTask8 = Integer.parseInt(scannerTask8.nextLine());
            int tensTask8;
            int onesTask8;
            int mulTask8;
            if (inputTask8 >= 10 && inputTask8 <= 99) {
                tensTask8 = inputTask8 / 10;
                onesTask8 = inputTask8 % 10;
                mulTask8 = tensTask8 * onesTask8;
                if (inputTask8 > mulTask8) {
                    System.out.println("Mul is smaller than the number");
                } else if (inputTask8 < mulTask8) {
                    System.out.println("Mul is bigger than the number");
                } else {
                    System.out.println("Mul equals the number");
                }
            } else if (inputTask8 / 10 == 0) {
                System.out.println("The two-digit number cannot start with 0 or be less than 10");

            } else {
                System.out.println("You entered non-positive or not two-digit number");
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } finally {
            scannerTask8.close();
        }
    }
}
