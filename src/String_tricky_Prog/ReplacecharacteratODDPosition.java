package String_tricky_Prog;

public class ReplacecharacteratODDPosition {

    public static void main(String[] args) {

        String s="automation";
        StringBuilder sb= new StringBuilder(s);
        String ns="";

        for(int i=0;i<s.length();i++){

            if(i%2!=0)
            {
               sb.setCharAt( i,'*');
            }

        }


        System.out.println(sb.toString());

    }
}
