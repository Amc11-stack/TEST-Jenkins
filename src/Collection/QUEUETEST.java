package Collection;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QUEUETEST {

    public static void main(String[] args) {

        Queue<Integer> qu= new ArrayDeque<>();

        qu.add(233);
        qu.offer(12);
        qu.add(45);


        System.out.println(qu.element());
    }
}
