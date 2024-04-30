package Politician;

public class PM extends Minister{
    private boolean isArrestPermission=false;

    public PM(String name,String constituency,Driver driver){
        super(name,constituency,driver);
        this.spendingLimit=10000000;
    }

    public boolean setArrestWarrant(){
        this.isArrestPermission=true;
        return this.isArrestPermission;
    }

    public boolean getArrestWarrant(){
        return this.isArrestPermission;
    }
}
