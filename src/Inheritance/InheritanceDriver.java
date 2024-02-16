package Inheritance;

public class InheritanceDriver {
    public static void main(String[] args){
        //Instantiate all employees
        SalariedEmployee Joe = new SalariedEmployee();
        HourlyEmployee Stephanie = new HourlyEmployee();
        HourlyEmployee Mary = new HourlyEmployee();
        CommisionEmployee Nicole = new CommisionEmployee();
        SalariedEmployee Renwa = new SalariedEmployee();
        BaseEmployee Mike = new BaseEmployee();
        CommisionEmployee Mahanaz = new CommisionEmployee();


        Joe.setFirstName("Joe");
        Joe.setLastName("Jones");
        Joe.setSocialSecurityNumber("111-11-1111");
        Joe.setWeeklySalary(2500);

        Stephanie.setFirstName("Stephanie");
        Stephanie.setLastName("Smith");
        Stephanie.setSocialSecurityNumber("222-22-2222");
        Stephanie.setWage(25);
        Stephanie.setNumberOfHours(32);

        Mary.setFirstName("Mary");
        Mary.setLastName("Quinn");
        Mary.setSocialSecurityNumber("333-33-3333");
        Mary.setWage(19);
        Mary.setNumberOfHours(47);

        Nicole.setFirstName("Nicole");
        Nicole.setLastName("Dior");
        Nicole.setSocialSecurityNumber("444-44-4444");
        Nicole.setCommissionRate(15);
        Nicole.setGrossSales(50000);

        Renwa.setFirstName("Renwa");
        Renwa.setLastName("Chanel");
        Renwa.setSocialSecurityNumber("555-55-5555");
        Renwa.setWeeklySalary(1700);

        Mike.setFirstName("Mike");
        Mike.setLastName("Davenport");
        Mike.setSocialSecurityNumber("666-66-6666");
        Mike.setBaseSalary(95000);

        Mahanaz.setFirstName("Mahanaz");
        Mahanaz.setLastName("Vaziri");
        Mahanaz.setSocialSecurityNumber("777-77-7777");
        Mahanaz.setCommissionRate(22);
        Mahanaz.setGrossSales(40000);

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

