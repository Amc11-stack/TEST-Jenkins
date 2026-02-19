package Array;
import java.util.*;
public class SORT_ARRY_By_Frequency {

    private static void sortArrayElementsByFrequency(int[] inputArray)
    {
        //Create LinkedHashMap with elements as keys and their occurrences as values
        //Remember LinkedHashMap maintains insertion order of elements

        Map<Integer, Integer> elementCountMap = new LinkedHashMap<>();

        //Check presence of each element in elementCountMap

        for (int i = 0; i < inputArray.length; i++)
        {
            if (elementCountMap.containsKey(inputArray[i]))
            {
                //If element is present in elementCountMap, increment its value by 1

                elementCountMap.put(inputArray[i], elementCountMap.get(inputArray[i])+1);
            }
            else
            {
                //If element is not present, insert this element with 1 as its value

                elementCountMap.put(inputArray[i], 1);
            }
        }

        //Construct an ArrayList holding all Entry objects of elementCountMap

        ArrayList<Map.Entry<Integer, Integer>> listOfEntry = new ArrayList<>(elementCountMap.entrySet());
        ArrayList<Integer> newrray = new ArrayList<>(elementCountMap.keySet());

        Collections.sort(newrray);
        System.out.println(newrray);

        //Sort listOfEntry based on values

        Collections.sort(listOfEntry, (Map.Entry<Integer,Integer> e1,Map.Entry<Integer,Integer> e2)-> e2.getValue().compareTo(e1.getValue()));
//                {
//
//                    @Override
//                    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2)
//                    {
//                        return o2.getKey().compareTo(o1.getKey());
//                    }
//                }
//        );

        //Print sorted array elements in descending order of their frequency

        System.out.println("Input Array : "+Arrays.toString(inputArray));

        System.out.println("Sorted Array Elements In Descending Order Of Their Frequency :");

        System.out.print("[ ");

        for (Map.Entry<Integer, Integer> entry : listOfEntry)
        {
//            int frequency = entry.getValue();
//            int counter=0;
//
//            while (counter <frequency)
//            {
//                System.out.print(entry.getKey()+" ");
//
//                counter++;
//            }

            System.out.println(entry.getKey()+":"+entry.getValue()+",");
        }

//        System.out.print("]");
    }

    public static void main(String[] args)
    {
        sortArrayElementsByFrequency(new int[] {7, 1, 3, 4, 7, 1, 7, 1, 4, 5, 1, 9, 3});
    }
}
