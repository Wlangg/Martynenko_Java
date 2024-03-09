package martynenko1;

import java.util.Scanner;

public class Martynenko1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Add first number: ");
        int a = scanner.nextInt();

        System.out.print("Add second number: ");
        int b = scanner.nextInt();

        String result = compareNumbers(a, b);
        System.out.println(result);

        performOperations(a, b);
    }

    public static String compareNumbers(int a, int b) {
        if (a > b) {
            return "a > b";
        } else if (a < b) {
            return "a < b";
        } else {
            return "a = b";
        }
    }
    /*Этот метод принимает два целых числа a и b в качестве аргументов и 
    сравнивает их. Если a больше b, возвращается строка "a > b", если a 
    меньше b, возвращается строка "a < b", и если a равно b, 
    возвращается строка "a = b". */

    public static void performOperations(int a, int b) {
        int plus = a + b;
        int minus = a - b;
        double delenije = (double) a / b;
        int umnojenie = a * b;

        System.out.println("a + b = " + plus);
        System.out.println("a - b = " + minus);
        System.out.println("a / b = " + delenije);
        System.out.println("a * b = " + umnojenie);
    }
}
/* Этот метод принимает два целых числа a и b в качестве аргументов и 
выполняет операции сложения, вычитания, деления и умножения. 
Результаты этих операций сохраняются в переменных 
plus, menus, delenije и umnojenie.
Затем результаты выводятся в консоль. */