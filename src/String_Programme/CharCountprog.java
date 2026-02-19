package String_Programme;

public class CharCountprog {

    public static void main(String[] args) {


        String s="aaaabbbbcc";

        StringBuilder sb= new StringBuilder();

        //o/p-: a4b4c2

         char[] ch= s.toCharArray();

         for (int i=0;i<ch.length-1;i++)
         {
             if(ch[i]!=ch[i+1]){
                int a= s.lastIndexOf(ch[i]);
                sb.append(ch[i]+a+"");
             }
         }

        System.out.println(sb.toString());

    }
}
