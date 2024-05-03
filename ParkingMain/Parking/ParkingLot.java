
package ParkingMain.Parking;
import java.util.ArrayList;
import ParkingMain.Services.*;
import ParkingMain.Vehicle.FuelType;
import ParkingMain.Vehicle.VehicleType;

public class ParkingLot {
    private static ParkingLot instance;
    private ArrayList<ParkingFloor> parkingFloors;
    private ArrayList<EntryPoint> entryPoints;
    private ArrayList<ExitPoint> exitPoints;
    private ParkingRate parkingRate;

    public ParkingLot(){
        this.parkingFloors = new ArrayList<ParkingFloor>();
        this.entryPoints = new ArrayList<EntryPoint>();
        this.exitPoints = new ArrayList<ExitPoint>();
        setParkingRate(4,3,2);
        
    }

    public static ParkingLot getInstance() {
        if (instance == null) {
            instance = new ParkingLot();
        }
        return instance;
    }

    public ArrayList<ParkingFloor> getListOfParkingFloors() {
        return this.parkingFloors;
    }  

    public ArrayList<EntryPoint> getListOfEntryPoints() {
        return this.entryPoints;
    }  

    public ArrayList<ExitPoint> getListOfExitPoints() {
        return this.exitPoints;
    }

    public ParkingSpot getParkingSpot(String spotID,int floorID,VehicleType vehicleType,FuelType fuelType){
       ParkingFloor floor = this.parkingFloors.get(floorID);
       return floor.getParkingSpot(spotID,vehicleType,fuelType);
    }

    public void vacateSpot(String spotID,int floorID,VehicleType vehicleType,FuelType fuelType){
        ParkingSpot spot = getParkingSpot(spotID,floorID,vehicleType,fuelType);
        spot.removeVehicle();
    }

    public void setParkingRate(int one,int two,int rest){
        this.parkingRate = new ParkingRate(4,3,2);
    }

    public ParkingRate getParkingRate(){
        return this.parkingRate;
    }
}
