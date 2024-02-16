package Polymorphism;

class CargoShip extends Ship {
    private int tonnage;

    public CargoShip() {
        super();
        this.tonnage = 0;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public void print() {
        System.out.println("Polymorphism.Ship{" +
                "name='" + super.getName() + '\'' +
                ", cargo capacity='" + tonnage + '\'' +
                '}');
    }
}
