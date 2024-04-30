package Politician;

public class Commissioner extends Person {
    private Driver driver;
    public Commissioner(String name,Driver driver){
        super(name);
        this.driver=driver;
    }

    public Driver getDriver(){
        return this.driver;
    }
}
