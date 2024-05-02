package ParkingMain.User;

import ParkingMain.Parking.*;
import ParkingMain.Services.*;

public class Admin extends BaseUser {
    private ParkingMain.Parking.ParkingLot parkingLotInstance;
    
    public Admin(String username, String password) { // Fix the constructor declaration
        super(username, password);
        this.parkingLotInstance = ParkingLot.getInstance();
    }

    public boolean addParkingFloor(int floorID) {
        // ParkingFloor floor =  this.parkingLotInstance.getListOfParkingFloors().get(floorID);
        // if(floor != null) {
        //     return false;
        // }; 
        ParkingFloor newFloor = new ParkingFloor(floorID);   
        this.parkingLotInstance.getListOfParkingFloors().add(newFloor);
        return true;
    }

    @SuppressWarnings("unlikely-arg-type")
    public boolean addParkingSpot(int floorID,ParkingSpot parkingSpot) {
        if(parkingSpot == null) return false; // Add a null check 

        // ParkingFloor floor =  this.parkingLotInstance.getListOfParkingFloors().get(floorID);
        // if(floor == null) {
        //     return false;
        // };
        this.parkingLotInstance.getListOfParkingFloors().get(floorID).getListOfParkingSpots().get(parkingSpot.getParkingSpotType()).add(parkingSpot);   
        return true;
    }

    @SuppressWarnings("unlikely-arg-type")
    public boolean addEntryPoint(EntryPoint entryPoint) {
        if(entryPoint == null) return false; // Add a null check 

        
        this.parkingLotInstance.getListOfEntryPoints().add(entryPoint);  
        return true;
    }

    @SuppressWarnings("unlikely-arg-type")
    public boolean addExitPoint(ExitPoint exitPoint) {
        if(exitPoint == null) return false; // Add a null check 

        this.parkingLotInstance.getListOfExitPoints().add(exitPoint);  
        return true;
    }

    public void setParkingRate(int one,int two,int rest){
        this.parkingLotInstance.setParkingRate(one,two,rest);
    }
}
