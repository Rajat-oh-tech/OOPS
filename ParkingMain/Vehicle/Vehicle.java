package ParkingMain.Vehicle;

public class Vehicle {
    private String licensePlate;
    private VehicleType vehicleType;
    private FuelType fuelType;

    public Vehicle(String licensePlate, VehicleType vehicleType, FuelType fuelType) {
        this.licensePlate = licensePlate;
        this.vehicleType = vehicleType;
        this.fuelType = fuelType;
    }

    public VehicleType getVehicleType() {
        return this.vehicleType;
    }

    public FuelType getFuelType() {
        return this.fuelType;
    }

    public String getLicensePlate() {
        return this.licensePlate;
    }
}
