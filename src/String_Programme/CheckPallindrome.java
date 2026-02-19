package String_Programme;

public class CheckPallindrome {

    public static Boolean checkpallindrome(String str) {

        char[] ch = str.toLowerCase().toCharArray();

        int left = 0;
        int right = ch.length - 1;



        while (left < right) {

            if (ch[left] != ch[right]) {
                return false;
            } else {

                left++;
                right--;
            }


        }


        return true;
    }

    public static void main(String[] args) {

        String s="Rotator";

      if(  checkpallindrome(s)){

          System.out.println("it is palalindrome");
      }
    }
}
