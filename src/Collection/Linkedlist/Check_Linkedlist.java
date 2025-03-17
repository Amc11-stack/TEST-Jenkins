package Collection.Linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class Check_Linkedlist {

    public static void main(String[] args) {


        LinkedList<Integer> li= new LinkedList<>();

            li.add(10);
            li.add(20);
            li.add(5);

        System.out.println(li);


        Collections.sort(li,Collections.reverseOrder());

        System.out.println(li);
    }

}
