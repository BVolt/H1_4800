package Polymorphism;

public class PolymorphismDriver {
    public static void main(String[] args){
        Ship[] shipCollection = new Ship[3];

        shipCollection[0] = new Ship();
        shipCollection[0].setName("Falcon");
        shipCollection[0].setYear("2007");

        CruiseShip crewShip = new CruiseShip();
        crewShip.setName("Infinity");
        crewShip.setYear("2020");
        crewShip.setPassengers(47);
        shipCollection[1] = crewShip;

        CargoShip garcoShip = new CargoShip();
        garcoShip.setName("Pelican");
        garcoShip.setYear("1999");
        garcoShip.setTonnage(27000);
        shipCollection[2] = garcoShip;

        for(Ship ship: shipCollection){
            ship.print();
        }
    }
}

