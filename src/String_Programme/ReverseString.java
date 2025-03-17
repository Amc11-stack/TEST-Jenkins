package String_Programme;

public class ReverseString {

    public static void main(String[] args) {

        String ss="aman kumar";
        String s="";

        for (int i=ss.length()-1;i>=0;i--)
        {

                s=s+ss.charAt(i);

        }

        System.out.println(s);
    }
}
