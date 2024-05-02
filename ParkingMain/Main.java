package ParkingMain;

import ParkingMain.Parking.*;
import ParkingMain.Services.*;
import ParkingMain.User.*;
import ParkingMain.Vehicle.*;

public class Main {
    
    public static void main(String[] args) {
        Admin admin=new Admin("admin","admin");
        admin.addParkingFloor(0);
        admin.addParkingFloor(1);
        admin.addParkingFloor(2);
        int ans=ParkingLot.getInstance().getListOfParkingFloors().size();
        System.out.println(ans);
        EntryPoint entry=new EntryPoint("entry1");
        ExitPoint exit=new ExitPoint("exit1");
        admin.addEntryPoint(entry);
        admin.addExitPoint(exit);

       
        ParkingSpot p1=new ParkingSpot("a1",ParkingSpotType.COMPACT);
        ParkingSpot p2=new ParkingSpot("a2",ParkingSpotType.COMPACT);
        ParkingSpot p3=new ParkingSpot("a2",ParkingSpotType.LARGE);
        ParkingSpot p4=new ParkingSpot("a3",ParkingSpotType.ELECTRIC);
        admin.addParkingSpot(1, p1);
        admin.addParkingSpot(1, p2);
        admin.addParkingSpot(1, p3);
        admin.addParkingSpot(1, p4);
       

        // generate cars
        Vehicle car1=new Vehicle("car1",VehicleType.CAR,FuelType.PETROL);
        Vehicle car2=new Vehicle("car2",VehicleType.CAR,FuelType.ELECTRIC);
        Vehicle bike1=new Vehicle("car3",VehicleType.MOTORBIKE,FuelType.PETROL);

        // bike entry
        Ticket T1=entry.generateTicketOnEntry(car1);
        System.out.println("Ticket" + T1);
    }
}
