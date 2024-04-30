package Politician;

public class Driver extends Person{
    private String vehicle;
    public Driver(String name,String vehicle){
        super(name);
        this.vehicle=vehicle;
    }
    public String  getVehicle(String vehicle){
        return this.vehicle;
    }
    
}
