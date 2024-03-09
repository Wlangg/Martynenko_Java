package martynenko2;

import java.util.Scanner;

public class Martynenko2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String a = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String b = scanner.nextLine();

        String result = compareStrings(a, b);
        System.out.println(result);
    }

    public static String compareStrings(String a, String b) {
        if (a.equals(b)) {
            return "String identcal";
        } else {
            return "String not identical";
        }
    }
}
