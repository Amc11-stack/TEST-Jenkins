package String_Programme;

public class Pallindrome {

    public static void main(String[] args) {


        String s="Rotator";
         s=s.toLowerCase();
        String reverse="";

       char[] cc= s.toLowerCase().toCharArray();

       for(int i=cc.length-1;i>=0;i--)
       {
           reverse= reverse+s.charAt(i);
       }

       if(s.equals(reverse)) {
           System.out.println(reverse);
       }
    }
}
