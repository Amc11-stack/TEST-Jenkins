package Collection;

import java.util.Comparator;

public class sortID implements Comparator<student> {

    @Override
    public int compare(student o1, student o2) {
        return o1.getID() - o2.getID();
    }
}
