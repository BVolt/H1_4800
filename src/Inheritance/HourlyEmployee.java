package Inheritance;

class HourlyEmployee extends Employee {
    int wage;
    int numberOfHours;

    public HourlyEmployee() {
        super();
        this.wage = 0;
        this.numberOfHours = 0;
    }

    public int getWage() {
        return wage;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    @Override
    public String toString() {
        return "Inheritance.HourlyEmployee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", wage= $" + wage +
                ", numberOfHours=" + numberOfHours +
                '}';
    }
}
