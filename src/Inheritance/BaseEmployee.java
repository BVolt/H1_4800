package Inheritance;

class BaseEmployee extends Employee {
    int baseSalary;

    public BaseEmployee() {
        super();
        this.baseSalary = 0;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "Inheritance.BaseEmployee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", baseSalary= $" + baseSalary +
                '}';
    }
}
