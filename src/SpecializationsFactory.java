import Courses.SoftEng;
import Courses.WebDev;

public class SpecializationsFactory extends AbstractStudentFactory {
    public void getCourse(String StudentType) {
        if (StudentType.equalsIgnoreCase("SoftEng")) {
            SoftEng newStudent = new SoftEng();
            newStudent.enroll();
        } else if (StudentType.equalsIgnoreCase("WebDev")) {
            WebDev newStudent = new WebDev();
            newStudent.enroll();
        } else {
            System.out.println("StudentType Error");
        }
    }
}
