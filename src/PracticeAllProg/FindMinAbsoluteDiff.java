package PracticeAllProg;

public class FindMinAbsoluteDiff {

    public static void main(String[] args) {

        int[] arr= {1, 5, 3, 19, 18, 25};

        int mindiff= Integer.MAX_VALUE;

        for(int i=0;i<arr.length-1;i++){

             int diff=  Math.abs(arr[i]-arr[i+1]);
              if(diff<mindiff)
              {

                  mindiff=diff;
              }

        }

        System.out.println(mindiff);
    }
}
