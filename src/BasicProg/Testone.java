package BasicProg;

public interface Testone {

    void choose();

    public static void testtwo(){

        System.out.println("test three");
    }

    default void test(){

        System.out.println("test one");

    }


}
