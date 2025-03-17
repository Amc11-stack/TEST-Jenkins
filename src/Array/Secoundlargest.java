package Array;

public class Secoundlargest {


    public static  void check2ndlargest(int[] arr){

        int firstelement;
        int secondelmnt;

       if(arr[0]>arr[1]){
            firstelement= arr[0];
            secondelmnt= arr[1];

       }else {
         firstelement= arr[1];
         secondelmnt=arr[0];
       }

       for(int i=2;i<arr.length;i++){
           if(arr[i]>firstelement){
               secondelmnt=firstelement;
               firstelement=arr[i];
           } else if (arr[i]<firstelement && arr[i]> secondelmnt) {

               secondelmnt=arr[i];

           }
       }

        System.out.println(secondelmnt);
    }

    public static void main(String[] args) {

        check2ndlargest(new int[] {45, 51, 28, 75, 49, 42});

    }
}
