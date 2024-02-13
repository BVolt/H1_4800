public class AggregationDriver {
    public static void main(String[] args) {
        Instructor nima = new Instructor("Nima", "Davarpanah", "3-2636");
        Instructor lan = new Instructor("Lan", "Yang", "3-2635");
        TextBook cleanCode = new TextBook("Clean Code", "Robert Martin", "Prentice Hall");
        TextBook designPatterns = new TextBook("Design Patterns", "Erich Gamma", "Addison Wesley");
        Course CS4800_05 = new Course("Software Engineering", nima, lan, cleanCode, designPatterns);

        CS4800_05.print();
    }
}

class Course{
    private String name;
    private Instructor instructorPrimary;
    private Instructor instructorSecondary;
    private TextBook textBookPrimary;
    private TextBook textBookSecondary;

    public Course(String name, Instructor instructorPrimary, Instructor instructorSecondary, TextBook textBookPrimary, TextBook textBookSecondary) {
        this.name = name;
        this.instructorPrimary = instructorPrimary;
        this.instructorSecondary = instructorSecondary;
        this.textBookPrimary= textBookPrimary;
        this.textBookSecondary = textBookSecondary;
    }

    public String getName() {
        return name;
    }

    public Instructor getInstructorPrimary() {
        return instructorPrimary;
    }

    public Instructor getInstructorSecondary() {
        return instructorSecondary;
    }

    public TextBook getTextBookPrimary() {
        return textBookPrimary;
    }

    public TextBook getTextBookSecondary() {
        return textBookSecondary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInstructorPrimary(Instructor instructorPrimary) {
        this.instructorPrimary = instructorPrimary;
    }

    public void setInstructorSecondary(Instructor instructorSecondary) {
        this.instructorSecondary = instructorSecondary;
    }

    public void setTextBookPrimary(TextBook textBookPrimary) {
        this.textBookPrimary = textBookPrimary;
    }

    public void setTextBookSecondary(TextBook textBookSecondary) {
        this.textBookSecondary = textBookSecondary;
    }

    public void print(){
        System.out.println("Course {" +
                "\nCourse Name= " + name +
                "\nPrimary Instructor= " + instructorPrimary.getFirstName()+ " " + instructorPrimary.getLastName() +
                "\nSecondary Instructor= " + instructorSecondary.getFirstName()+ " " + instructorSecondary.getLastName() +
                "\nPrimary Text= " + textBookPrimary.getTitle() +
                "\nAuthor= " + textBookPrimary.getAuthor() +
                "\nSecondary Text= " + textBookSecondary.getTitle() +
                "\nAuthor= " + textBookSecondary.getAuthor() +
                "\n}");
    }
}

class Instructor{
    private String firstName;
    private String lastName;
    private String officeNumber;

    public Instructor(String firstName, String lastName, String officeNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.officeNumber = officeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }
}

class TextBook{
    String title;
    String author;
    String publisher;

    public TextBook(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}