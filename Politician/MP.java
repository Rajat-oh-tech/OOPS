package Politician;

public class MP extends Person {
    private String constituency;
    private Driver driver;
    protected int spendingLimit;

    public MP(String name, String constituency,Driver driver) {
        super(name);
        this.constituency = constituency;
        this.driver=driver;
        this.spendingLimit=100000;
    }

    public String getConstituency() {
        return this.constituency;
    }

    public Driver getDriver(){
        return this.driver;
    }

    public int getSpendingLimit(){
        return this.spendingLimit;
    }

    public boolean canGetArrested(int amountSpent){
        return amountSpent>this.spendingLimit;
    }
}
