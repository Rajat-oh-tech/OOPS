package Inverter;

public class SolarInverter extends Inverter {
    boolean hasBattery;
    boolean hasGrid;

    public SolarInverter(String type, double current, double operatingVoltage, boolean hasBattery) {
        super(type, current, operatingVoltage);
        this.hasBattery = hasBattery;
        if(this.type.equals("GTI")) {
            this.hasGrid = true;
        } else {
            this.hasGrid = false;
        }
    }

}
