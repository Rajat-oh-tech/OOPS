package ParkingMain.User;

import ParkingMain.Parking.*;
import ParkingMain.Services.*;

public class Admin extends BaseUser {
    private ParkingMain.Parking.ParkingLot parkingLotInstance;
    
    public Admin(String username, String password) { // Fix the constructor declaration
        super(username, password);
        this.parkingLotInstance = ParkingLot.getInstance();
    }

    public void addParkingFloor(ParkingFloor parkingFloor) {   
        this.parkingLotInstance.getListOfParkingFloors().add(parkingFloor);
    }

    @SuppressWarnings("unlikely-arg-type")
    public boolean addParkingSpot(int floorID,ParkingSpot parkingSpot) {
        if(parkingSpot == null) return false; // Add a null check 

        if(!this.parkingLotInstance.getListOfParkingFloors().contains(floorID)){
            return false;
        }
        
        this.parkingLotInstance.getListOfParkingFloors().get(floorID).getListOfParkingSpots().get(parkingSpot.getParkingSpotType()).add(parkingSpot);   
        return true;
    }

    @SuppressWarnings("unlikely-arg-type")
    public boolean addEntryPoint(int floorID,EntryPoint entryPoint) {
        if(entryPoint == null) return false; // Add a null check 

        if(!this.parkingLotInstance.getListOfParkingFloors().contains(floorID)){
            return false;
        }
        
        this.parkingLotInstance.getListOfEntryPoints().add(entryPoint);  
        return true;
    }

    @SuppressWarnings("unlikely-arg-type")
    public boolean addExitPoint(int floorID,ExitPoint exitPoint) {
        if(exitPoint == null) return false; // Add a null check 

        if(!this.parkingLotInstance.getListOfParkingFloors().contains(floorID)){
            return false;
        }
        
        this.parkingLotInstance.getListOfExitPoints().add(exitPoint);  
        return true;
    }

    public void setParkingRate(int one,int two,int rest){
        this.parkingLotInstance.setParkingRate(one,two,rest);
    }
}
