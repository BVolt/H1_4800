public class PolymorphismDriver {
    public static void main(String[] args){
        Ship[] shipCollection = new Ship[3];
        shipCollection[0] = new Ship("Falcon", "2007");
        shipCollection[1] = new CruiseShip("Infinity", "2020", 47);
        shipCollection[2] = new CargoShip("Pelican", "1999", 27000);

        for(Ship ship: shipCollection){
            ship.print();
        }
    }
}

class Ship{
    private String name;
    private String year;

    public Ship(String name, String year) {
        this.name = name;
        this.year = year;
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
        System.out.println("Ship{" +
                "name='" + name + '\'' +
                ", year='" + year + '\'' +
                '}');
    }
}

class CruiseShip extends Ship{
    private int passengers;

    public CruiseShip(String name, String year, int passengers) {
        super(name, year);
        this.passengers = passengers;
    }

    public int getPassenger() {
        return passengers;
    }

    public void setPassenger(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public void print(){
        System.out.println("Ship{" +
                "name='" + super.getName() + '\'' +
                ", passengers='" + passengers + '\'' +
                '}');
    }
}

class CargoShip extends Ship{
    private int tonnage;

    public CargoShip(String name, String year, int tonnage) {
        super(name, year);
        this.tonnage = tonnage;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public void print(){
        System.out.println("Ship{" +
                "name='" + super.getName() + '\'' +
                ", cargo capacity='" + tonnage + '\'' +
                '}');
    }
}
