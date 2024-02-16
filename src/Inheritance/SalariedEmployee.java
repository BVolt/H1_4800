package Inheritance;

class SalariedEmployee extends Employee {
    int weeklySalary;

    public SalariedEmployee() {
        super();
        this.weeklySalary = 0;
    }

    public int getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(int weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public String toString() {
        return "Inheritance.SalariedEmployee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", weeklySalary= $" + weeklySalary +
                '}';
    }
}
