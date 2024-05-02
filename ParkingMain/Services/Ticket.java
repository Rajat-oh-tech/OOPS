package ParkingMain.Services;

import java.sql.Date;

import ParkingMain.Vehicle.*;

public class Ticket {
    private String spotID;
    private int floorID;
    private Date entryTime;
    private Date exitTime;
    private VehicleType vehicleType;
    private FuelType fuelType;
    private String vehicleID;
    private int amount=0;
    private boolean isPaid=false;

    public Ticket(String licenseNumber, VehicleType vehicleType,FuelType fuelType,int floorID,String spotID) {
        this.entryTime = new Date(System.currentTimeMillis());
        this.vehicleType=vehicleType;
        this.vehicleID=licenseNumber;
        this.floorID=floorID;
        this.spotID=spotID;
        this.fuelType=fuelType;
    }

    public void setExitTime(){
        this.exitTime = new Date(System.currentTimeMillis());
    }
    public String getSpotID(){
        return this.spotID;
    }
    public int getFloorID(){
        return this.floorID;
    }

    public VehicleType getVehicleType(){
        return this.vehicleType;
    }

    public FuelType getFuelType(){
        return this.fuelType;
    }

    public Date getEntryTime(){
        return this.entryTime;
    }
    public Date getExitTime(){
        return this.entryTime;
    }
    public void setIsPaid(boolean isPaid){
        this.isPaid=isPaid;
    }
}
