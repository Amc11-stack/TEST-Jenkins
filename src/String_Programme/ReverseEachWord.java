package String_Programme;

public class ReverseEachWord {

    static  String ReverseEachWord(String ss){

       String[] a= ss.trim().split(" ");

         String addwords="";

         for(int i=0;i<a.length;i++)
         {
            String word= a[i];

            String reverseword="";

            for(int j=word.length()-1;j>=0;j--)
            {
                reverseword= reverseword+word.charAt(j);

            }
         addwords+=reverseword+" ";
         }


        return addwords;
    }

    public static void main(String[] args) {

         String s="Aman kumar";

        System.out.println(ReverseEachWord(s));

    }
}
