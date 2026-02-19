package Array;

public class TestSubarray {

    public static void main(String[] args) {

        int[] a={42, 15, 12, 8, 6, 32};

        int expectsum=26;

        int start=0;

        int sum=0;

       // int initial=a[0];

        //sum+=initial;

        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];


            while(sum>expectsum && start<=i){

                sum=sum-a[start];
                start++;
            }


            if(sum==expectsum)
            {

                for(int j=start;j<=i;j++)
                {
                    System.out.println(a[j]);
                }
            }
        }



    }
}
