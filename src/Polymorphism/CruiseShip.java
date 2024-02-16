package Polymorphism;

class CruiseShip extends Ship {
    private int passengers;

    public CruiseShip() {
        super();
        this.passengers = 0;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public void print() {
        System.out.println("Polymorphism.Ship{" +
                "name='" + super.getName() + '\'' +
                ", passengers='" + passengers + '\'' +
                '}');
    }
}
