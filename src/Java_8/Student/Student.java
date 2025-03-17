package Java_8.Student;

public class Student {

    private int id;
    private String name;
    private int RollNo;

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    private String Gender;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", RollNo=" + RollNo +
                ", subject='" + subject + '\'' +
                '}';
    }

    private String subject;

    public Student(int id, String name, int rollNo, String subject,String gender) {
        this.id = id;
        this.name = name;
        this.RollNo = rollNo;
        this.subject = subject;
        this.Gender=gender;
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

    public int getRollNo() {
        return RollNo;
    }

    public void setRollNo(int rollNo) {
        RollNo = rollNo;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }



}
