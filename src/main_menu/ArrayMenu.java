package main_menu;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class ArrayMenu {
    static Scanner sc = new Scanner(System.in);

    public static int[] menu() {
        int n;
        do {

            System.out.println("WHICH TYPE OF CASE DO YOU WANT");
            System.out.println("1-->BEST CASE : [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15]");
            System.out.println("2-->WORST CASE : [15,14,13,12,11,10,9,8,7,6,5,4,3,2,1]");
            System.out.println("3-->RANDOM CASE");
            System.out.println("4-->GENERATE YOUR ARRAY");
            System.out.println("5-->EXIT FROM TERMINAL");
            n = sc.nextInt();
            return switch (n) {
                case 1 -> bestcaseArray();

                case 2 -> worstcaseArray();

                case 3 -> {
                    System.out.println("ENTER YOUR ELEMENT SIZE");
                    int size = sc.nextInt();
                    yield randomCaseArray(size);
                }
                case 4 -> {
                    System.out.println("ENTER YOUR ELEMENT SIZE");
                    int size = sc.nextInt();
                    yield userCaseArray(size);
                }
                case 5 -> {
                    System.out.println("EXITING");
                    yield null;
                }
                default -> {
                    System.out.println("Invalid option! Please select a valid option.");
                    yield null;
                }
            };

        } while (true);
    }

    public static int[] bestcaseArray() {
        int bestCase[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        return bestCase;
    }

    public static int[] worstcaseArray() {
        int worstCase[] = { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        return worstCase;
    }

    public static int[] randomCaseArray(int size) {
        int randomCase[] = new int[size];
        Random random = new Random();
        for (int i = 0; i < randomCase.length; i++) {
            randomCase[i] = random.nextInt(100);
        }
        return randomCase;
    }

    public static int[] userCaseArray(int size) {
        int[] userCase = new int[size];
        System.out.println("Enter your elements");
        for (int i = 0; i < userCase.length; i++) {
            if (i != userCase.length - 1) {
                System.out.print("Element" + (i + 1) + ": ");
            } else {
                System.out.print("Last Element" + (i + 1) + ": ");
            }

            userCase[i] = sc.nextInt();
        }
        System.out.println("\nYOUR ARRAY: " + Arrays.toString(userCase));
        return userCase;
    }
}
