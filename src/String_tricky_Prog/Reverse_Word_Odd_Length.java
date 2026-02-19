package String_tricky_Prog;

public class Reverse_Word_Odd_Length {

    public static void main(String[] args) {

//        Input: "I love coding challenges"
//        Output: "I evol coding segnellahc"

        String s=  "I love coding challenges";

     String[] words = s.split(" ");


     String ns="";

     for(int i=0;i< words.length;i++)
     {
         if(i%2!=0){
             StringBuilder sb= new StringBuilder();

             String word= words[i];

             ns+=sb.append(word).reverse().toString()+" ";

         }
         else{
             ns+=words[i]+" ";
         }


     }

        System.out.println(ns);

    }
}
