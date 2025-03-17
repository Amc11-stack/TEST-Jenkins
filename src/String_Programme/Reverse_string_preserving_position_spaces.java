package String_Programme;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reverse_string_preserving_position_spaces {

    public static void main(String[] args) {

        String s="AMn Kumar Choudhury";



//      char[] a=  s.toCharArray();
//
//      char[] b= new char[a.length];
//
//      for(int i=0;i<a.length-1;i++){
//
//          if(a[i]==' '){
//              b[i]=a[i];
//          }
//      }
//
//      int j=b.length-1;
//
//      for(int i=0;i<a.length;i++)
//      {
//          if(a[i]!=' ')
//          {
//              if(b[j]==' '){
//                  j--;
//              }
//              b[j]=a[i];
//              j--;
//          }
//      }
//   System.out.println(String.valueOf(b));
//

      List<Character> ls= Arrays.stream(s.chars().toArray()).filter(x->x != ' ').mapToObj(x-> (char)x).collect(Collectors.toList());

      Collections.reverse(ls);

      Iterator<Character> ch=ls.iterator();

      StringBuilder sb= new StringBuilder();

      for(char cc:s.toCharArray()){

          if(cc == ' ')
          {
              sb.append(cc);

          }
          else{
              sb.append(ch.next());
          }
      }
        System.out.println(sb);


    }
}
