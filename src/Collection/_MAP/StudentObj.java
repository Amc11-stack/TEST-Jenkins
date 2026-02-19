package Collection._MAP;

public class StudentObj {

    private String name;
    private int age;
    private int rollno;


    StudentObj(String name,int age,int rollno)
    {
        this.name=name;
        this.rollno=rollno;
        this.age=age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return "StudentObj{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rollno=" + rollno +
                '}';
    }
}
