package String_Programme;

public class preservesamespace {

    public static void main(String[] args) {

        String s = "my name is aman";

        char[] ch = s.toCharArray();

        char[] resize = new char[ch.length];

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ' ') {
                resize[i] = ' ';
            }
        }

        int j = ch.length - 1;

        for (int i = 0; i < ch.length; i++) {

            if (ch[i] != ' ') {

                if (resize[j] == ' ') {

                    j--;
                }

                resize[j] = ch[i];
                j--;
            }
        }

        System.out.println(String.valueOf(resize));
    }
}
