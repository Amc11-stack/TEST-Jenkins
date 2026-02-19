package Java_8.PracticeNewlambda.Test.NewPractice;

public class EmployeeCheck {


    private int id;

    private String name;



    private int age;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private  double salary;

    public EmployeeCheck(int id, String name, int age,double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary=salary;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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


    @Override
    public String toString() {
        return "EmployeeCheck{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }


}
