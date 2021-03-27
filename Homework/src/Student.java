public class Student {
    private int studentID;
    private String firstName;
    private String lastname;

    public Student(int studentID, String firstName, String lastname) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastname = lastname;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
