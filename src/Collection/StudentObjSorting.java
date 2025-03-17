package Collection;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class student implements  Comparable<student> {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRollno() {
        return Rollno;
    }

    public void setRollno(Integer rollno) {
        Rollno = rollno;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    Integer Rollno;
    Integer ID;


    public student(String name, Integer rollno, Integer ID) {
        this.name = name;
        Rollno = rollno;
        this.ID = ID;
    }



    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", Rollno=" + Rollno +
                ", ID=" + ID +
                '}';
    }

    public int compareTo(student s) {
        return this.getRollno()-s.getRollno();
    }

}

public class StudentObjSorting  {



    public static void main(String[] args) {

        List<student> scol = new ArrayList<>();

        scol.add(new student("Aman",112,33));

        scol.add(new student("Shivika",113,45));
        scol.add(new student("Ram",56,77));

//        scol.stream().sorted(Comparator.comparing(student::getName));


        System.out.println(scol);

        Collections.sort(scol,new sortID());

        System.out.println(scol);


        System.out.println("--------------");

        Collections.sort(scol,new sortName());

        System.out.println(scol);





    }




}
