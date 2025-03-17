package Java_8;

@FunctionalInterface
interface  name{

    void sum(int a,int b);
}
public class LambadaTest{

    public static void main(String[] args) {

      name nm=  (a,b) -> {
          if (a < b) {
              throw new NumberFormatException("a must greater then b");
          } else {
              System.out.println("sum is:" + (a + b));
          }
      };

//      nm.sum(6,10);
        nm.sum(12,10);
    }

}
