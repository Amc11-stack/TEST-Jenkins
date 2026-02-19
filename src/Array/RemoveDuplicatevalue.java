package Array;

import java.util.Arrays;

public class RemoveDuplicatevalue {

    public static void main(String[] args) {

        int[] a={12,2,43,123,2,43,78,123};

        int[] b= new int[a.length];
        int count=0;

        boolean isDuplicate=false;


        for(int i:a){

            for(int j=0;j<b.length;j++)
            {
                if(i==a[j])
                {
                    isDuplicate=true;
                    break;
                }

            }

            if(!isDuplicate){
                b[count]=i;
                count++;
            }
        }


        System.out.println(Arrays.toString(b));


    }
}
