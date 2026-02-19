package DesignedPattern;


class  Implimemnt extends  Thread{

    public void run() {
        SIngleTon singleton = SIngleTon.getInstance();
        singleton.showMessage("Test this");
    }



}
public class Test {



    public static void main(String[] args) {

        Thread t1= new Implimemnt();
        Thread t2= new Implimemnt();
        Thread t3= new Implimemnt();
        Thread t4= new Implimemnt();

        t1.start();
        t2.start();
        t3.start();
        t4.start();






    }
}
