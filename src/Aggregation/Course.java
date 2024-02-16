package Aggregation;

public class Course{
    private String name;
    private Instructor instructorPrimary;
    private Instructor instructorSecondary;
    private TextBook textBookPrimary;
    private TextBook textBookSecondary;

    public Course() {
        this.name = "";
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
        System.out.println("Aggregation.Course {" +
                "\nAggregation.Course Name= " + name +
                "\nPrimary Aggregation.Instructor= " + instructorPrimary.getFirstName()+ " " + instructorPrimary.getLastName() +
                "\nSecondary Aggregation.Instructor= " + instructorSecondary.getFirstName()+ " " + instructorSecondary.getLastName() +
                "\nPrimary Text= " + textBookPrimary.getTitle() +
                "\nAuthor= " + textBookPrimary.getAuthor() +
                "\nSecondary Text= " + textBookSecondary.getTitle() +
                "\nAuthor= " + textBookSecondary.getAuthor() +
                "\n}");
    }
}
