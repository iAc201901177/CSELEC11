public class FactoryProducer {
    public static AbstractStudentFactory getCourse(boolean isSpecialization) {
        if (isSpecialization) {
            return new SpecializationsFactory();
        } else {
            return new StudentFactory();
        }
    }
}
