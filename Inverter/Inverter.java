package Inverter;

public class Inverter {
    String type;
    double current;
    double operatingVoltage;
    double powerRating;

    public Inverter(String type, double current, double operatingVoltage) {
        this.type = type;
        this.current = current;
        this.operatingVoltage = operatingVoltage;
        this.powerRating = calculatePowerRating();
    }

    double calculatePowerRating() {
        return current * operatingVoltage;
    }

    
}