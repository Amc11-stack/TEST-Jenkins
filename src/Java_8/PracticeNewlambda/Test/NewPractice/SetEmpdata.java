package Java_8.PracticeNewlambda.Test.NewPractice;

import java.util.ArrayList;
import java.util.List;

public class SetEmpdata {

    public static List<EmployeeCheck> getdata(){

        List<EmployeeCheck> emp= new ArrayList<>();

        emp.add(new EmployeeCheck(110,"Aman",31,13000));
        emp.add(new EmployeeCheck(201,"Tarun",23,25500));
        emp.add(new EmployeeCheck(305,"Rohit",65,120000));
        return  emp;

    }


    public static void main(String[] args) {


    }
}
