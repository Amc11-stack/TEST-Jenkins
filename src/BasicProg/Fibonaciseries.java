package BasicProg;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonaciseries {

    public static void main(String[] args) {

        int a=0; int b=1;
        Scanner scn= new Scanner(System.in);
        System.out.println("enter the number:");
        int num= scn.nextInt();

        for (int i=1;i<=num;i++)
        {
            System.out.println(a);
            int x=  a+b;
            a=b;
            b=x;
        }


    }

}
