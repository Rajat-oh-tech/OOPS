package ParkingMain.Services;
import ParkingMain.Parking.*;
public class ExitPoint {
    private String exitPointID;
    public ExitPoint(String exitPointID){
        this.exitPointID=exitPointID;
    }
    public int checkout(Ticket ticket){
        int floorId = ticket.getFloorID();
        String spotId = ticket.getSpotID();
        ParkingLot.getInstance().vacateSpot(spotId, floorId, ticket.getVehicleType(),ticket.getFuelType());
        ticket.setExitTime();
        int amount=this.calculateBill(ticket);
        ticket.setIsPaid(true);
        return amount;
    }

    public int calculateBill(Ticket ticket){
        long timeDiff=ticket.getExitTime().getTime()-ticket.getEntryTime().getTime();
        int hours=(int)timeDiff/(1000*60*60);
        int amount=0;
        if(hours>=1){
            amount+=ParkingLot.getInstance().getParkingRate().getOne();
            hours-=1;
        }
        if(hours>=2){
            amount+=2*ParkingLot.getInstance().getParkingRate().getTwo();
            hours-=2;
        }
        else{
            amount+=hours*ParkingLot.getInstance().getParkingRate().getRest();
        }
        ticket.setAmount(amount);
        return amount;
    }
}
