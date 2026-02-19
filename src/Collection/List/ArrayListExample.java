package Collection.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {


        List<Employee> li= new ArrayList<>();

        li.add(new Employee(1132,"Aman",32000));
        li.add(new Employee(1132,"Rahul",32000));
        li.add(new Employee(1132,"Rohit",32000));
        li.add(new Employee(1132,"Zubi",32000));

        Collections.sort(li, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getSalary()-o2.getSalary();
            }
        });

        System.out.println(li);

        System.out.println("--------");

        Collections.sort(li, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.getName().compareTo(o1.getName());
            }
        });


        System.out.println(li);




    }



}
