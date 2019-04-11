package by.bsu.model.entity;

public class Plane extends Transport implements FlyBehavior{
    
    private String type;
    private String name;

    public Plane() {
    }

    public Plane(String type, String name, double carrying, int seats, double maxRange) {
        super(carrying, seats, maxRange);
        this.type = type;
        this.name = name;
    }

    @Override
    public void fly() {
        View.print("I can fly");
    }

    @Override
    public String toString() {
        return "Plane{" + "type = " + type + ", name = " + name + ", carrying = "
                + this.getCarrying() + ", seats = " + this.getSeats() 
                + ", range = " + this.getMaxRange()+ '}';
    }
    
}