package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Citydata implements  Comparable<Citydata> {


    public static String getCity() {
        return City;
    }

    public static void setCity(String city) {
        City = city;
    }

    public static int getAge() {
        return Age;
    }

    public static void setAge(int age) {
        Age = age;
    }

    public Citydata(String name, String City, int Age) {

        this.name=name;
       this.City=City;
        this.Age=Age;

    }

    public static String name;

    public static String getName() {
        return name;
    }

    @Override
    public String toString() {
        //return "{Citydata ="+City+"Name ="+name+"Age="+Age};
     return "{Name : "+name+", City : "+City+", age : "+Age+"}";
    }

    public static void setName(String name) {
        Citydata.name = name;
    }


    public static  String City;

    public static  int Age;


    @Override
    public int compareTo(Citydata cc) {
        return this.Age-cc.Age;
    }
}

class Mainclass{

    public static void main(String[] args) {

        ArrayList<Citydata> ls= new ArrayList<>();
        ls.add(new Citydata("Aman","BBSR",32));
        ls.add(new Citydata("Gyan","BBSR",33));
        ls.add(new Citydata("Ankit","Gurgaon",40));
        ls.add(new Citydata("Sourabh","Delhi",10));
       // ls.add(new Citydata("Laasya","HYD",22));

        Collections.sort(ls);

        System.out.println(ls);

    }


}
