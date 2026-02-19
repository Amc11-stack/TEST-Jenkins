package Java_8.PracticeNewlambda.Test.NewPractice;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestEmp {

    public static void main(String[] args) {

        List<EmployeeCheck> ll= SetEmpdata.getdata();

//        Collections.sort(ll,(B1,B2)-> B1.getAge()-B2.getAge());
//
//        System.out.println(ll);

         ll.stream().sorted(Comparator.comparing(EmployeeCheck::getSalary).reversed()).forEach(System.out::println);

         ll.stream().filter(l1->l1.getSalary()<30000).map(EmployeeCheck::getName).collect(Collectors.toList()).forEach(System.out::println);




    }


}
