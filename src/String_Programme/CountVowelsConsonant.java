package String_Programme;

public class CountVowelsConsonant {

    public static void main(String[] args) {

        String s = "amn@@$$12455fdhvh";

        String numric = s.replaceAll("[^0-9]","");
        String specialChar = s.replaceAll("[a-zA-Z0-9]","");
        String letter = s.replaceAll("[^a-zA-Z]","");

//        char[] cc = s.toCharArray();
//
//        for (char c : cc) {
//
//            if (Character.isLetter(c)) {
//
//                letter += c;
//            }
//
//            if(Character.isDigit(c)){
//
//                numric+=c;
//        }
//        if(!Character.isLetterOrDigit(c)){
//
//            specialChar+=c;
//    }
//        }
//
//
        System.out.println(numric);
        System.out.println(specialChar);
        System.out.println(letter);


    }

}
