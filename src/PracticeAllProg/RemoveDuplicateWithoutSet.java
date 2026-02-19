package PracticeAllProg;

public class RemoveDuplicateWithoutSet {

    public static void main(String[] args) {

        int[] a={1, 2, 2, 3, 4, 4};

        int[] b= new int[a.length];
        int count=0;

        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]!=a[i+1]){
                b[count++]= a[i];
            }
        }

     b[count++]=a[a.length-1];
         for(int i=0;i<count;i++)
         {
             System.out.println(b[i]);
         }

    }
}
