package Polymorphism;

class Ship {
    private String name;
    private String year;

    public Ship() {
        this.name = "";
        this.year = "";
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void print() {
        System.out.println("Polymorphism.Ship{" +
                "name='" + name + '\'' +
                ", year='" + year + '\'' +
                '}');
    }
}
