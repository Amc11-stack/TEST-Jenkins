package String_Programme;

public class Reverse_each_Word {

    public static String reverseEachword(String words){

        String newStr="";

        String[] wordsArray=words.split(" ");



        for(String word:wordsArray){

            StringBuilder sb= new StringBuilder();
            for(int i=word.length()-1;i>=0;i--){

                sb.append(word.charAt(i));


            }

            newStr+=sb.toString()+" ";
        }

        System.out.println(newStr);

        return newStr;

    }
    public static void main (String[] args) throws java.lang.Exception
    {


        String s="Aman Kumar";

        reverseEachword(s);




    }
}
