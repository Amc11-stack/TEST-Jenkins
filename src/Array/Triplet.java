package Array;

import java.util.Arrays;

public class Triplet {

    public static void getArrayTriplets(int[] a,int sum){

        System.out.println("print array..."+Arrays.toString(a));

        Arrays.sort(a);

        for(int i=0;i<a.length-2;i++){

            int let= i+1;

            int right= a.length-1;

            while(let<right){

                if(a[let]+a[right]+a[i]==sum){
                    System.out.println("["+a[let]+a[right]+a[i]+"]");

                    let++;
                    right--;

                } else if (a[let]+a[right]+a[i]<sum) {

                    let ++;

                }
                else {
                    right--;
                }
            }
        }

    }

    public static void main(String[] args)
    {
        getArrayTriplets(new int[] {7, 5, 9, 3, 0, 8, 6}, 12);

        System.out.println("===========================");

        getArrayTriplets(new int[] {-3, 7, -1, -5, 2, -9, 1}, 0);

        System.out.println("===========================");

        getArrayTriplets(new int[] {17, 51, 39, 29, 33, 21, 65}, 89);
    }
}
