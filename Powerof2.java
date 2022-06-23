package CoreJava;

import java.util.Scanner;

public class Powerof2 {
    public static void main(String[] args)
    {
        System.out.println("Enter the number n");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n<31)
        {
            for(int i=0;i<=n;i++)
            {
                int powerofnumber = (int) Math.pow(2,i);
                System.out.println("Power of number: "+i +"   "+powerofnumber);
            }
        }
        else
            System.out.println("Entered number is greater than 31 so it overflow the int");
    }
}
