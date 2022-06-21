package CoreJava;

import java.util.Random;
import java.util.Scanner;

public class HeadTail {
    public static void main(String[] args)
    {
        Random r = new Random();

        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of times coin flipped");
        int m = s.nextInt();
        int head=0;
        int tail=0;
        for(int i=1;i<=m;i++)
        {
            int n = r.nextInt(1000);
            if(n%2==0)
            {
                tail=tail+1;
            }
            else {
                head=head+1;
            }
        }
       // double headp = head/m ;
        //double tailp = tail/m ;
        System.out.println(head);
        System.out.println(tail);
    }
}
