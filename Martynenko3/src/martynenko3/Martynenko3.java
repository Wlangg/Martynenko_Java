package martynenko3;

import java.util.Scanner;

public class Martynenko3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printEvenNumbers(array);
    }

    public static void printEvenNumbers(int[] array) {
        System.out.print("Чётные числа: ");
        for (int number : array) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
    }
}