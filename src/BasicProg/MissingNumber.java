//package BasicProg;
//
//import java.util.Arrays;
//import java.util.LinkedList;
//import java.util.List;
//
//public class MissingNumber {
//
//    public static void main(String[] args) {
//
//        Integer[] a= {1,2,4,5};
//
//       int b= Arrays.stream(a).max();
//       int c= Arrays.stream(a).max().getAsInt();
//
//        LinkedList<Integer> ar= new LinkedList<>(Arrays.asList(a));
//
//       for (int i=b;i<=c;i++)
//       {
//
//       }
//
//
//        int missingnum = 0;
//
//        for(int i=0;i<a.length;i++)
//        {
//
//            if(a[i]!=(i+1))
//            {
//                missingnum=i+1;
//                break;
//            }
//        }
//
//        System.out.println(missingnum);
//
//    }
//}
