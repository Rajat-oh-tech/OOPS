package Politician;

public class Main {
    public static void main(String[] args) {
        MP mp=new MP("Rajat", "Bareilly", new Driver("Bahadur","Scorpio"));
        Minister minister=new Minister("Rajat", "Bareilly", new Driver("Baadal","Hyundai"));
        PM pm=new PM("Modi","Varanasi",new Driver("Rahul","Audi"));
        Commissioner com=new Commissioner("Amit Shah",new Driver("Khadge", "Range Rover"));
        pm.setArrestWarrant();
        boolean ans=minister.canGetArrested(100000000,pm);
        System.out.println(ans);
    }
}
