package String_tricky_Prog;

import java.util.Arrays;

public class Reversewithspace {
    public static void main(String[] args) {

         String s="aman is bad guy";

       char[] a=  s.toCharArray();

       char[] b= new char[a.length];
       int j=0;

       for(int i=0;i<a.length;i++)
       {
           if(a[i]==' '){

               b[i]=a[i];
           }
       }

       j =b.length-1;

       for(int i=0;i<a.length;i++)
       {
           if(a[i]!=' '){

               if(b[j]==' '){
                   j--;
               }

               b[j]=a[i];
               j--;
           }
       }


        System.out.println(String.valueOf(b));
    }
}
