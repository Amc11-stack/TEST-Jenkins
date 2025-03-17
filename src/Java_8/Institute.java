package Java_8;

import java.util.List;

public class Institute {

    private String CollegeName;

    public String getCollegeName() {
        return CollegeName;
    }

    public void setCollegeName(String collegeName) {
        CollegeName = collegeName;
    }

    public List<String> getCities() {
        return Cities;
    }

    public void setCities(List<String> cities) {
        Cities = cities;
    }

    private List<String> Cities;
    public <T> Institute(String CollegeName, List<String> Cities) {
        this.CollegeName=CollegeName;
        this.Cities=Cities;

    }
}
