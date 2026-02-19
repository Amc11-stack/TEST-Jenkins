package Array;

import java.util.Arrays;

public class RemoveDuplicateWithoutCollection {

    public static void getdata(int[] arr,Boolean checkData){

        int count=0;



        int[] b= new int[arr.length];

        for(int i=0;i<arr.length;i++)
        {
            boolean status=false;
            for(int j=0;j<count;j++){
                if(arr[i]==b[j]){

                    status=true;
                    break;
                }
            }


            if(!status){
                b[count]=arr[i];
                count++;
            }
        }


        System.out.println(Arrays.toString(Arrays.copyOf(b,count)));
    }

    public static void main(String[] args) {
        int[ ]arr={1,9,3,7,2,43,3,8,3};

       getdata(arr,true);





    }
}
