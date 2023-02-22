import java.util.Scanner;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(
                "Courses: \n" +
                        "ComSci\n" +
                        "Engineering\n" +
                        "InfoTec\n\n" +

                        "Specializations: \n" +
                        "SoftEng\n" +
                        "WebDev\n\n");
        System.out.print("Course or Specialization?(c/s): ");
        String userInput = input.nextLine();

        if (userInput.equalsIgnoreCase("s")) {
            AbstractStudentFactory newStudent = FactoryProducer.getCourse(true);
            System.out.print("Enter Specialization: ");
            String specialization = input.nextLine();

            newStudent.getCourse(specialization);
        } else {
            AbstractStudentFactory newStudent = FactoryProducer.getCourse(false);
            System.out.print("Enter Course: ");
            String course = input.nextLine();

            newStudent.getCourse(course);
        }

        input.close();
    }
}
