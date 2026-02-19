package String_Programme;

public class PallindromeOfEverywords {

    public static int stringpalindrome(String s) {

        String[] words = s.split(" ");

        int count = 0;

        for (String word : words) {

              if(countpallindrome(word)){

                  count++;
              }
        }


        return count;
    }

    public static boolean countpallindrome(String words) {

        char[] cc = words.toCharArray();

        int left = 0;
        int right = cc.length - 1;

        boolean status = false;
        for (char c : cc) {
            while (left < right) {

                if (cc[left] != cc[right]) {

                    return status;
                } else {
                    status = true;

                }

                left++;
                right--;
            }
        }

        return status;
    }

    public static void main(String[] args) {

        String s = "This is first level of radar testing madam";

        System.out.println(stringpalindrome(s));
    }
}
