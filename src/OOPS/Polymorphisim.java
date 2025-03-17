package OOPS;


class SuperClass
{
    void methodOfSuperClass()
    {
        System.out.println("From Super Class");
    }
}
class SubClass extends SuperClass
{
    //Super Class Method Overrided
    void methodOfSuperClass()
    {
        System.out.println("From Sub Class");
    }
}

public class Polymorphisim
{
    static void util(SuperClass superclass)
    {
        superclass.methodOfSuperClass();
        //For each execution of this method, different objects will be passed to it.
        //which Object will be used is determined during run time only.
        //This shows dynamic polymorphism.
    }

    void methodOverloaded()
    {
        //No argument method, return type is void
    }

    int methodOverloaded(int i)
    {
        //Returns int type
        return i;
    }

    int methodOverloaded(double d)
    {
        //Same return type as of above method
        return 0;
    }

//    void methodOverloaded(double d)
//    {
//        //Duplicate method because it has same method signature as of above method
//    }

    public static void main(String[] args)
    {
        SuperClass superclass1 = new SuperClass();
        SubClass subclass = new SubClass();
        SuperClass superclass2 = new SubClass();

        util(superclass1);  //SuperClass object is passes to util()
        util(subclass);     //SubClass object is passed to util()
        util(superclass2); //SubClass object is passed to util()
    }
}