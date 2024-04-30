package Inverter;

public class NonSolarInverter extends Inverter {
    boolean hasBattery=true;
    boolean hasGrid=false;
    public NonSolarInverter(String type, double current, double operatingVoltage) {
        super(type, current, operatingVoltage);
    }
}
