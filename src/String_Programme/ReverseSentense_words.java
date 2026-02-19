package String_Programme;

public class ReverseSentense_words {

    public static String reversesentenceword(String ss){

        StringBuilder sd= new StringBuilder();

       String[] words= ss.split(" ");

       for(int i=words.length-1;i>=0;i--)
       {
           sd.append(words[i]+" ");

       }

        return sd.toString();

    }

    public static void main(String[] args) {

        System.out.println(reversesentenceword("aman is bad boy"));
    }
}
