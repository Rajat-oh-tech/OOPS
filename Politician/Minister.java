package Politician;

public class Minister extends MP{

    public Minister(String name,String constituency,Driver driver){
        super(name,constituency,driver);
        this.spendingLimit=1000000;  // 10m lakh
    }  

    public boolean canGetArrested(int amountSpent,PM pm){
        return amountSpent>spendingLimit && pm.getArrestWarrant();
    }
}
