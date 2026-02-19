package Collection._MAP;


import java.util.*;

public class SortStudentObj {

    public static void main(String[] args) {

        TreeMap<Integer,StudentObj> tmp= new TreeMap<>();

        tmp.put(12,new StudentObj("Aman",34,112));
        tmp.put(11,new StudentObj("Satish",55,23));
        tmp.put(8,new StudentObj("Rohit",7,322));
        tmp.put(21,new StudentObj("Sonu",34,224));



        List<Map.Entry<Integer,StudentObj>> ll= new ArrayList<>(tmp.entrySet());

        Collections.sort(ll,new Comparator<Map.Entry<Integer,StudentObj>>(){
            @Override
            public int compare(Map.Entry<Integer, StudentObj> o1, Map.Entry<Integer, StudentObj> o2) {
                        int agecompare=Integer.compare(o1.getValue().getAge()%2,o2.getValue().getAge()%2);
              int cname=  o1.getValue().getName().compareTo(o2.getValue().getName());
                if(agecompare!=0){
                    return  agecompare;
                }
                if(cname==0){
                    return  cname;
                }
                else{
                    return Integer.compare(o2.getValue().getAge(),o1.getValue().getAge());
                }
            }

        });

    }
}
