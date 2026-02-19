package BasicProg;

import java.util.Scanner;

public class Pallindrome {

    public static boolean checkPallindrome(int n){

        int reverse=0;
        int num=n;

        if(n==0)
        {
            return false;
        }
        else{

            while(n>0){

                int a= n%10;
                reverse=reverse*10+a;
                n=n/10;
            }
            return num==reverse;
        }



    }

    public static void main(String[] args) {
        System.out.println("Hello World");

        Scanner scn= new Scanner(System.in);

        System.out.print("please enter the number :");

        int n= scn.nextInt();

        scn.close();

        if(checkPallindrome(n)){
            System.out.println("number is pallindrome");
        }
        else{
            System.out.println("number isnot pallindrome");
        }
    }
}
