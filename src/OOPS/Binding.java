package OOPS;


class  A{

    void  method(){

        System.out.println("test one");
    }
}
class  B extends  A{

    void  method(){

        System.out.println("test two");
    }
}

public class Binding {

    public static void main(String[] args) {

        A a1= new A();
        a1.method();
        B b1= new B();
        b1.method();

        A aa= new B();
        aa.method();


    }
}
