package Aggregation;

public class Instructor{
    private String firstName;
    private String lastName;
    private String officeNumber;

    public Instructor() {
        this.firstName = "";
        this.lastName = "";
        this.officeNumber = "";
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