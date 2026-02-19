package DesignedPattern;

public class SIngleTon {

    private  static  SIngleTon test;

    private  SIngleTon(){

    }

    public  static  SIngleTon getInstance(){

        if (test==null)
        {
            synchronized (SIngleTon.class)
            {
                if (test==null) {

                    test= new SIngleTon();
                }

            }
        }
        return  test;
    }


    public void showMessage(String threadName) {
        System.out.println("Hello from " + threadName);
    }
}
