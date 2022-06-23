package CoreJava;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args)
    {
        System.out.println("Enter two number");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int t = a;
        a=b;
        b=t;
        System.out.println("swapped number is"+a);
        System.out.println(b);
    }
}
