package CoreJava;

import java.util.Scanner;

public class Harmonicnumber {
    static double nthHarmonic(int n)
    {
        float harmonic = 1;
        for(int i=2;i<=n;i++)
        {
            harmonic += (float) 1/i;
        }
        return harmonic;
    }
    public static void main(String[] args)
    {
        System.out.println("enter the number n");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(nthHarmonic(n));

    }
}
