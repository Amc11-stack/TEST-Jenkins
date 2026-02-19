package Array;

public class JavaprogrammeToFindLeaders {

    public static void main(String[] args) {

        int[] a=  {12, 9, 7, 14, 8, 6, 3};

        int max=a[a.length-1];
       // int max;

        for(int i=a.length-2;i>=0;i--)
        {
            if(a[i]>max)
            {
                System.out.println(a[i]);

                max=a[i];

            }

        }


    }
}
