package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentException {

    public static void main(String[] args) {

            List<String> list = new ArrayList<>();
            list.add("Java");
            list.add("Python");
            list.add("C++");

            Iterator<String> iterator = list.iterator();
            while (iterator.hasNext()) {
                String language = iterator.next();
                if (language.equals("Python")) {
                    list.add("aman");  // ✅ Safe removal
                }
            }

            System.out.println(list);  // Output: [Java, C++]
        }
    }
