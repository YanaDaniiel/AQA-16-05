package com.hillel;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        //Task_1
        int[] arrTask1 = new int[10];
        int j = 2;
        for (int i = 0; i < arrTask1.length; i += 1, j += 2) {
            arrTask1[i] = j;
        }
        System.out.println("Task_1");
        for (int a : arrTask1) {
            System.out.print(a + " ");
        }
        System.out.printf("%n");
        for (int b : arrTask1) {
            System.out.println(b);
        }

        //Task_2
        int[] arrTask2 = new int[50];
        int k = 1;
        for (int i = 0; i < arrTask2.length; i += 1, k += 2) {
            arrTask2[i] = k;
        }
        System.out.println("Task_2");
        for (int a : arrTask2) {
            System.out.print(a + " ");
        }
        System.out.printf("%n");
        int temp;
        int l = arrTask2.length - 1;
        for (int i = 0; i < arrTask2.length / 2; i++, l--) {
            temp = arrTask2[i];
            arrTask2[i] = arrTask2[l];
            arrTask2[l] = temp;
        }
        for (int b : arrTask2) {
            System.out.printf(b + " ");
        }
        System.out.printf("%n");

        //Task_3
        int[] arrFirstTask3 = new int[5];
        int[] arrSecondTask3 = new int[5];
        float sum1 = 0;
        float sum2 = 0;
        float average1;
        float average2;

        for (int i = 0; i < arrFirstTask3.length; i++) {
            arrFirstTask3[i] = random.nextInt(0, 5);
        }
        System.out.println("Task 3");
        for (int a : arrFirstTask3) {
            System.out.printf(a + " ");
            sum1 += a;
        }
        average1 = sum1 / arrFirstTask3.length;
        System.out.printf("%n");
        for (int i = 0; i < arrFirstTask3.length; i++) {
            arrSecondTask3[i] = random.nextInt(0, 5);
        }
        for (int b : arrSecondTask3) {
            System.out.printf(b + " ");
            sum2 += b;
        }
        average2 = sum2 / arrSecondTask3.length;
        System.out.printf("%n");
        if (average1 > average2) {
            System.out.println("Average1 > Average2");
        } else if (average1 < average2) {
            System.out.println("Average1 < Average2");
        } else {
            System.out.println("Average1 = Average2");
        }
    }
}
