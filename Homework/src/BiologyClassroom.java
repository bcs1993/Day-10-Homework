import java.util.ArrayList;

public class BiologyClassroom implements Classroom {
    private String classroomName;
    ArrayList<Student> students;

    public BiologyClassroom(String classroomName, ArrayList<Student> students) {
        this.classroomName = classroomName;
        this.students = students;
    }

    public String getClassroomName() {
        return classroomName;
    }

    public void setClassroomName(String classroomName) {
        this.classroomName = classroomName;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }


    @Override
    public String addStudent() {
        return "Has been added";
    }

    @Override
    public String remove(int StudentId) {
        return  "Has been removed";
    }
}
