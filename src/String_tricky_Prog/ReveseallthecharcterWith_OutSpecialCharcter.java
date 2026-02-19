package String_tricky_Prog;

public class ReveseallthecharcterWith_OutSpecialCharcter {

    public static void main(String[] args) {

        String s = "$@ndeep,!234iu";
        // Reverse this except the special characters.. Special characters will stay at their index.

        char[] ch = s.toCharArray();
        char[] c = new char[ch.length];

        // First, put special characters in their positions
        for (int i = 0; i < ch.length; i++) {
            if (!Character.isLetterOrDigit(ch[i])) {
                c[i] = ch[i];
            }
        }

        // Now, fill the rest in reverse (only alphanumeric)
        int j = ch.length - 1;

        for (int i = 0; i < ch.length; i++) {
            if (Character.isLetterOrDigit(ch[i])) {
                while (j >= 0 && !Character.isLetterOrDigit(ch[j])) {
                    j--; // skip special characters in reverse
                }
                c[j] = ch[i];
                j--;
            }
        }

        System.out.println(String.valueOf(c));
    }
}
