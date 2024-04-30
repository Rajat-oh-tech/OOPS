package Inverter;

public class Main {
    
    public static void main(String [] args){
        SolarInverter pcu = new SolarInverter("PCU", 20, 220, true);
        SolarInverter gti = new SolarInverter("GTI", 30, 220, false);


        NonSolarInverter zelio = new NonSolarInverter("Zelio", 15, 220);
        NonSolarInverter icruze = new NonSolarInverter("iCruze", 25, 220);
    }
}