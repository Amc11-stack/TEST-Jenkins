package Collection;

import java.util.Comparator;

public class sortName implements Comparator<student> {

    @Override
    public int compare(student o1, student o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
