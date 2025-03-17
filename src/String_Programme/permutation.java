package String_Programme;

public class permutation {

    public static void getpermutation(String input) {


        getpermutation("", input);

    }

    public static void getpermutation(String permutation, String input) {


        if (input.length() == 0) {
            System.out.println(permutation);
        }

        for (int i = 0; i < input.length(); i++) {
            getpermutation(permutation + input.charAt(i), input.substring(0, i) + input.substring(i + 1, input.length()));

        }
    }


    public static void main(String[] args) {


    getpermutation("ABC");
 }
}
