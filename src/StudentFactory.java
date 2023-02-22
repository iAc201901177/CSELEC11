import Courses.ComSci;
import Courses.Engineering;
import Courses.InfoTec;

public class StudentFactory extends AbstractStudentFactory {

    public void getCourse(String StudentType) {
        if (StudentType.equalsIgnoreCase("InfoTec")) {
            InfoTec newStudent = new InfoTec();
            newStudent.enroll();
        } else if (StudentType.equalsIgnoreCase("ComSci")) {
            ComSci newStudent = new ComSci();
            newStudent.enroll();
        } else if (StudentType.equalsIgnoreCase("Engineering")) {
            Engineering newStudent = new Engineering();
            newStudent.enroll();
        } else {
            System.out.println("StudentType Error");
        }
    }
}
