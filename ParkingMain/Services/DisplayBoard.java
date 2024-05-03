package ParkingMain.Services;

import ParkingMain.Parking.ParkingSpotType;

public class DisplayBoard {
    public void displayEmptySpots(ParkingSpotType parkingSpotType,int length){
        System.out.println("Available spots for "+parkingSpotType +"is" +length);  
    }
}
