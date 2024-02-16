package Inheritance;

class CommisionEmployee extends Employee {
    int commissionRate;
    int grossSales;

    public CommisionEmployee() {
        super();
        this.commissionRate = 0;
        this.grossSales = 0;
    }

    public int getCommissionRate() {
        return commissionRate;
    }

    public int getGrossSales() {
        return grossSales;
    }

    public void setCommissionRate(int commissionRate) {
        this.commissionRate = commissionRate;
    }

    public void setGrossSales(int grossSales) {
        this.grossSales = grossSales;
    }

    @Override
    public String toString() {
        return "Inheritance.CommisionEmployee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", commissionRate=" + commissionRate + "%" +
                ", grossSales= $" + grossSales +
                '}';
    }
}
