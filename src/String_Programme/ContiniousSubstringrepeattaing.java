package String_Programme;

public class ContiniousSubstringrepeattaing {

    public static void main(String[] args) {

        String s= "aaadhhhhhhhhfffff";

        int maxlen=1;
        int currentlen=1;

       char c= s.charAt(0);

       StringBuilder sb= new StringBuilder();

       for(int i=1;i<s.length();i++)
       {
           if(s.charAt(i)==s.charAt(i-1)){

               currentlen++;
               if(currentlen>maxlen)
               {
                   maxlen=currentlen;
                   c=s.charAt(i);
               }
           }

           else {
               currentlen=1;
           }
       }

        System.out.println(String.valueOf(c).repeat(maxlen));

    }


}
