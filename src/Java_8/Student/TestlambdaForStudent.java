package Java_8.Student;

import java.util.*;
import java.util.stream.Collectors;

public class TestlambdaForStudent {

    public static void main(String[] args) {

      List<Student> ls= Arrays.asList(
                new Student(11,"Aman",1123,"MATH","MALE"),
                new Student(12,"RAHUL",1124,"CHEM","MALE"),
                new Student(13,"Mandy",1125,"MATH","MALE"),
                new Student(14,"SRK",11236,"BIO","MALE"),
              new Student(14,"SIBANI",11236,"BIO","FEMALE"),
              new Student(14,"SHIVIKA",11236,"BIO","FEMALE"),
              new Student(14,"LAASYA",11236,"BIO","FEMALE")

        );

        //Check predicate:
//        ls.stream().filter(x -> x.getSubject().equalsIgnoreCase("MATH")).forEach(x-> System.out.println(x.getName()));
//
//        Student st=ls.stream().filter(x -> x.getSubject().equalsIgnoreCase("CSC")).findAny().orElse(null);
//
//        System.out.println(st.getName());

        //Check consumer:
//        ls.stream().filter(x -> x.getSubject().equalsIgnoreCase("MATH")).forEach(x-> System.out.println(x.getName()));
//
//        ls.forEach(x-> System.out.println(x));

        //check Function:

       //ls.stream().filter(x -> x.getSubject().equalsIgnoreCase("MATH")).map(Student::getName).forEach(System.out::println);

       //ls.stream().map(Student::getName).forEach(System.out::println);

//        System.out.println(ss);

//       Long a= ls.stream().map(Student::getGender).filter(x->x.equalsIgnoreCase("FEMALE")).count();
//
//       System.out.println(a);
//
//       ls.stream().filter(x->x.getGender().equalsIgnoreCase("FEMALE")).map(Student::getName).forEach(System.out::println);

//       //count number of male and female
//        Map<String, Long> noOfMaleAndFemaleEmployees=ls.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));
//
//        System.out.println(noOfMaleAndFemaleEmployees);










    }
}
