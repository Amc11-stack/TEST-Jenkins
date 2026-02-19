package String_Programme;

public class RetrivespecialCharcter {

    public static String retrive(String ss)
    {
        StringBuilder sd= new StringBuilder();
        for(int i=0;i<ss.length();i++)
        {


            char cc=ss.charAt(i);

            if(!Character.isLetterOrDigit(cc)){
                sd.append(cc);
            }
        }

          return sd.toString();
    }

    public static String replacespecial(String ss)
    {
       ss= ss.replaceAll("[^a-zA-Z0-9]","");
       return ss;
    }
    public static void main(String[] args) {

        String ss="am%$%%&vgdh^(";

        System.out.println( replacespecial(ss));

        System.out.println( retrive(ss));

    }





}
