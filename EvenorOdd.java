package CoreJava;

import java.util.Scanner;

public class EvenorOdd {
    public static void main(String[] args)
    {
        System.out.println("enter the number n");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n%2==0)
        {
            System.out.println("Number is prime");
        }
        else
            System.out.println("Number is odd");
    }
}
