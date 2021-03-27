import java.util.ArrayList;

public class Main {
    public static void  main(String[] args) {
        Student brian = new Student(11111, "Brian", "Smith");
        Student amber = new Student(11112, "Amber", "Bishop");
        Student marquis = new Student(11113, "Marquis", "Taylor");
        ArrayList<Student> biologyStudents = new ArrayList();
        biologyStudents.add(brian);
        biologyStudents.add(amber);
        biologyStudents.add(marquis);

        BiologyClassroom firstBiologyClass = new BiologyClassroom("Biology", biologyStudents);

        biologyStudents.remove(Integer.valueOf(11112)); {
            System.out.println("Student has been removed");
            
        }
    }
}
