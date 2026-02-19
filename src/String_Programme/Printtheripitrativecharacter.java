package String_Programme;

public class Printtheripitrativecharacter {

    public static void main(String[] args) {


        String s="amanChoudhury";

        int[] repeat= new int[256];

        for(int i=0;i<s.length();i++)
        {
            repeat[s.charAt(i)]++;

        }

        for(int i=0;i<256;i++)
        {
            if(repeat[i]>1 || repeat[i]==1){
                System.out.println((char) i + " → " + repeat[i] + " times");
            }
        }

    }
}
