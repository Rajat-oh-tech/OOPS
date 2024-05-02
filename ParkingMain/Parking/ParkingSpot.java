package ParkingMain.Parking;
import ParkingMain.Vehicle.*;

public class ParkingSpot {
    private String spotID;
    private ParkingSpotType parkingSpotType;
    private boolean isSpotAvailable;
    private Vehicle vehicle;

    public ParkingSpot(String spotID, ParkingSpotType parkingSpotType) {
        this.spotID = spotID;
        this.parkingSpotType= parkingSpotType;
        this.vehicle = null;
        this.isSpotAvailable = true;
    }

    public String getSpotID(){
        return this.spotID;
    }
    public boolean isSpotAvailable(){
        return this.isSpotAvailable;
    }
    public void assignVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
        this.isSpotAvailable = false;
    }
    public void removeVehicle(){
        this.vehicle = null;
        this.isSpotAvailable = true;
    }   
    public Vehicle getVehicle(){
        return this.vehicle;
    }

    public ParkingSpotType getParkingSpotType(){
        return this.parkingSpotType;
    }
}
