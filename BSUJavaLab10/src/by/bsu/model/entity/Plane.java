package by.bsu.model.entity;

public class Plane extends Transport implements FlyBehavior{
    
//    private final Type TYPE = Type.DEFAULT;
//    private final String NAME = "Unknown";
    
    private String type;
    private String name;

    public Plane() {
    }

    public Plane(String type, String name, double carrying, double seating, double maxRange) {
        super(carrying, seating, maxRange);
        this.type = type;
        this.name = name;
    }
    
    //public enum Type {
    //    AIRBUS, BOEING, EMBRAER, TY, IL, IAK, DEFAULT;
    //}

    @Override
    public void fly() {
//        throw new UnsupportedOperationException("Not supported yet."); 
            //To change body of generated methods, choose Tools | Templates.
        View.print("I can fly");
    }

    @Override
    public String toString() {
        return "Plane{" + "type=" + type + ", name=" + name + '}';
    }
    
}