
package ParkingMain.Parking;

import java.util.HashMap;

import ParkingMain.Vehicle.FuelType;
import ParkingMain.Vehicle.Vehicle;
import ParkingMain.Vehicle.VehicleType;

import java.util.ArrayList;
import java.util.Collection;


public class ParkingFloor {
    private int floorID;
    private HashMap<ParkingSpotType, ArrayList<ParkingSpot>> parkingSpots;

    public ParkingFloor(int floorID) {
        this.floorID = floorID;
        this.parkingSpots = new HashMap<ParkingSpotType, ArrayList<ParkingSpot>>();
        parkingSpots.put(ParkingSpotType.COMPACT, new ArrayList<ParkingSpot>());
        parkingSpots.put(ParkingSpotType.HANDICAPPED, new ArrayList<ParkingSpot>());    
        parkingSpots.put(ParkingSpotType.LARGE, new ArrayList<ParkingSpot>());
        parkingSpots.put(ParkingSpotType.ELECTRIC, new ArrayList<ParkingSpot>());
        parkingSpots.put(ParkingSpotType.MOTORBIKE, new ArrayList<ParkingSpot>());
    }
    public int getFloorID() {
        return floorID;
    }

    public HashMap<ParkingSpotType, ArrayList<ParkingSpot>> getListOfParkingSpots() {
        return this.parkingSpots;
    }

    public ParkingSpot getParkingSpot(String spotID,VehicleType vehicleType,FuelType fuelType){
        ParkingSpotType parkingSpotType = this.getParkingSpotTypeForVehicle(vehicleType,fuelType);
        ArrayList<ParkingSpot> parkingSpots = this.parkingSpots.get(parkingSpotType);
        for(ParkingSpot parkingSpot: parkingSpots){
            if(parkingSpot.getSpotID().equals(spotID)){
                return parkingSpot;
            }
        }
        return null;
    }

    public ParkingSpotType getParkingSpotTypeForVehicle(VehicleType vehicleType,FuelType fuelType){
        switch (vehicleType) {
            case CAR: 
                if (fuelType == FuelType.ELECTRIC) {
                    return ParkingSpotType.ELECTRIC;   
                }
                return ParkingSpotType.COMPACT;
            case MOTORBIKE:
                if (fuelType == FuelType.ELECTRIC) {
                    return ParkingSpotType.ELECTRIC;   
                }
                return ParkingSpotType.MOTORBIKE;
            case TRUCK:
                if (fuelType == FuelType.ELECTRIC) {
                    return ParkingSpotType.ELECTRIC;   
                }
                return ParkingSpotType.LARGE;

            case VAN:
                if (fuelType == FuelType.ELECTRIC) {
                    return ParkingSpotType.ELECTRIC;   
                }
                return ParkingSpotType.LARGE;
            default:
                return ParkingSpotType.LARGE;
        }
    }

    public boolean canPark(Vehicle vehicle){
        ParkingSpotType parkingSpotType = this.getParkingSpotTypeForVehicle(vehicle.getVehicleType(),vehicle.getFuelType());
        ArrayList<ParkingSpot> parkingSpots = this.parkingSpots.get(parkingSpotType);
        if(parkingSpots.size() > 0)
            return true;
        return false;
    }

    public ParkingSpot findSpotForParking(Vehicle vehicle){
        ParkingSpotType parkingSpotType = this.getParkingSpotTypeForVehicle(vehicle.getVehicleType(),vehicle.getFuelType());
        ArrayList<ParkingSpot> parkingSpots = this.parkingSpots.get(parkingSpotType);
        for(ParkingSpot parkingSpot: parkingSpots){
            if(parkingSpot.isSpotAvailable()){
                return parkingSpot;
            }
        }
        return null;
    }
}