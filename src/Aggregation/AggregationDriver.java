package Aggregation;

public class AggregationDriver {
    public static void main(String[] args) {
        Instructor nima = new Instructor();
        nima.setFirstName("Nima");
        nima.setLastName("Davarpanah");
        nima.setOfficeNumber("3-2636");

        Instructor lan = new Instructor();
        lan.setFirstName("Lan");
        lan.setLastName("Yang");
        lan.setOfficeNumber("3-2635");

        TextBook cleanCode = new TextBook();
        cleanCode.setTitle("Clean Code");
        cleanCode.setAuthor("Robert Martin");
        cleanCode.setPublisher("Prentice Hall");

        TextBook designPatterns = new TextBook();
        cleanCode.setTitle("Design Patterns");
        cleanCode.setAuthor("Erich Gamma");
        cleanCode.setPublisher("Addison Wesley");

        Course CS4800 = new Course();
        CS4800.setName("Software Engineering");
        CS4800.setInstructorPrimary(nima);
        CS4800.setInstructorSecondary(lan);
        CS4800.setTextBookPrimary(cleanCode);
        CS4800.setTextBookSecondary(designPatterns);

        CS4800.print();
    }
}





