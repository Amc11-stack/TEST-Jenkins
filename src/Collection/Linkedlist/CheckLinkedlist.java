package Collection.Linkedlist;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


class  Student{

    String name;

    int mark;

    public Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    public  String toString(){

        return  name+":"+mark;
    }
}
public class CheckLinkedlist {

    public static void main(String[] args) {

//        PriorityQueue<Integer> pr= new PriorityQueue<Integer>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2.compareTo(o1);
//            }
//        });

//        pr.offer(12);
//        pr.offer(100);
//        pr.offer(23);
//        pr.offer(14);
//        pr.offer(398);

        PriorityQueue<Student> pr= new PriorityQueue<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.mark-o2.mark;
            }
        });

         pr.offer(new Student("Aman",23));
         pr.offer(new Student("satur",239));
         pr.offer(new Student("sanjan",17));


        while(!pr.isEmpty()){

            System.out.println(pr.poll());
        }





    }
}
