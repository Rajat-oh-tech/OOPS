package ParkingMain.Services;

import ParkingMain.Parking.*;
import ParkingMain.Vehicle.*;
import java.util.ArrayList;
public class EntryPoint {
    private String entryID;

    public EntryPoint(String entryID) {
        this.entryID = entryID;
    }

    public String getEntryID(){
        return this.entryID;
    }

    public Ticket generateTicketOnEntry(Vehicle vehicle){
        ArrayList<ParkingFloor> floors=ParkingLot.getInstance().getListOfParkingFloors();
        for(ParkingFloor floor:floors){
            if(floor.canPark(vehicle)){
                ParkingSpot spot=floor.findSpotForParking(vehicle);
                if(spot==null){
                    System.out.println("No spot available");
                    return  null;
                }
                spot.assignVehicle(vehicle);
                Ticket ticket=this.getParkingTicket(vehicle.getLicensePlate(),vehicle.getVehicleType(),vehicle.getFuelType(),floor.getFloorID(),spot.getSpotID());
                System.out.println("Ticket generated for vehicle with license plate: "+vehicle.getLicensePlate());
                return ticket;
            }
        }  
        return null;
    }

    public Ticket getParkingTicket(String licenseNumber, VehicleType vehicleType,FuelType fuelType,int floorID,String spotID){
        return new Ticket(licenseNumber,vehicleType,fuelType,floorID,spotID);
    }

    
}
