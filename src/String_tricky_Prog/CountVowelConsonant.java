package String_tricky_Prog;

public class CountVowelConsonant {

    public static void main(String[] args) {

        String s="hello";

        int vowelcount=s.replaceAll("[^aeiouAEIOU]","").length();
        int consCount=s.replaceAll("[aeiouAEIOU]","").length();
        System.out.println(consCount);
        System.out.println(vowelcount);

    }
}
