public class InheritanceDriver {
    public static void main(String[] args){
        //Instantiate all employees
        SalariedEmployee Joe = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);
        HourlyEmployee Stephanie = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
        HourlyEmployee Mary = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);
        CommisionEmployee Nicole = new CommisionEmployee("Nicole", "Dior", "444-44-4444", 15, 50000);
        SalariedEmployee Renwa = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);
        BaseEmployee Mike = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);
        CommisionEmployee Mahanaz = new CommisionEmployee("Mahanaz", "Vaziri", "777-77-7777", 22, 40000);

        //Print all employee info
        System.out.println(Joe);
        System.out.println(Stephanie);
        System.out.println(Mary);
        System.out.println(Nicole);
        System.out.println(Renwa);
        System.out.println(Mike);
        System.out.println(Mahanaz);
    }
}

class Employee{
    String firstName;
    String lastName;
    String socialSecurityNumber;

    public Employee(String first_name, String last_name, String social_security_number){
        this.firstName = first_name;
        this.lastName = last_name;
        this.socialSecurityNumber = social_security_number;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                '}';
    }
}

class SalariedEmployee extends Employee{
    int weeklySalary;

    public SalariedEmployee(String first_name, String last_name, String social_security_number, int weekly_salary){
        super(first_name, last_name, social_security_number);
        this.weeklySalary = weekly_salary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", weeklySalary= $'" + weeklySalary + '\'' +
                '}';
    }
}

class HourlyEmployee extends Employee{
    int wage;
    int numberOfHours;

    public HourlyEmployee(String first_name, String last_name, String social_security_number, int wage, int number_of_hours){
        super(first_name, last_name, social_security_number);
        this.wage = wage;
        this.numberOfHours = number_of_hours;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", wage= $" + wage +
                ", numberOfHours=" + numberOfHours +
                '}';
    }
}

class CommisionEmployee extends Employee{
    int commissionRate;
    int grossSales;

    public CommisionEmployee(String first_name, String last_name, String social_security_number, int commission_rate, int gross_sales){
        super(first_name, last_name, social_security_number);
        this.commissionRate = commission_rate;
        this.grossSales = gross_sales;
    }

    @Override
    public String toString() {
        return "CommisionEmployee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", commissionRate=" + commissionRate + "%" +
                ", grossSales= $" + grossSales +
                '}';
    }
}

class BaseEmployee extends Employee{
    int baseSalary;

    public BaseEmployee(String first_name, String last_name, String social_security_number, int base_salary){
        super(first_name, last_name, social_security_number);
        this.baseSalary = base_salary;
    }

    @Override
    public String toString() {
        return "BaseEmployee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", baseSalary= $" + baseSalary +
                '}';
    }
}