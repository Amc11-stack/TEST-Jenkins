package String_Programme;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class CommonCharbetweentwoString {

    public static void main(String[] args) {

        String s1="aman kumar";

        String s3= "nandan Aman Kumar";

       char[] cc= s1.replaceAll("\\s","").toCharArray();
       Character[] ch= new Character[cc.length];

      List<Character> lc= Arrays.asList(ch);

        LinkedHashSet<Character> lh= new LinkedHashSet<>(lc);

        s1.chars().filter(c->! Character.isWhitespace(c)) .mapToObj(c->(char)c).collect(StringBuilder::new,StringBuilder::append,StringBuilder::append).toString().toCharArray();






    }
}
