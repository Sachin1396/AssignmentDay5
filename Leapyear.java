package CoreJava;

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        System.out.println("Enter the year");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int length = String.valueOf(year).length();
        if (length == 4) {
            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("year is leap year");
            } else
                System.out.println("year is not leap year");

        } else
            System.out.println("entered year is not 4 digit");

    }
}
