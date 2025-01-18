package EntranceExitModules;

import ParkingLotImplementation.ParkingLot;
import ParkingLotManagerModule.ParkingLotManager;
import ParkingSpot.BaseParkingSpot;
import TicketManager.Ticket;
import VehcileManager.Vehcile;
import VehcileManager.VehcileType;

public class EntranceGate {
    public Vehcile vehcile;
    public Ticket ticket;
    public ParkingLot singletonInstance;
    public EntranceGate(ParkingLot singletonInstance){
        this.singletonInstance=singletonInstance;
    }
    public Ticket issueTicket(Vehcile vehcile){
        ParkingLotManager parkingLotManager=null;
        if(vehcile.vehcileType.equals(VehcileType.FOURWHEELER)){
            parkingLotManager=singletonInstance.getFourWheelerParkingSpotManager();
        }
        else if (vehcile.vehcileType.equals(VehcileType.TWOWHEELER)){
            parkingLotManager = singletonInstance.getTwoWheelerParkingSpotManager();
        }
        else {
            System.out.println("Unsupported Vehcile Type ");
        }
        if(parkingLotManager==null)
            return null;
        BaseParkingSpot parkingSpot = parkingLotManager.findParkingSpace();
        if(parkingSpot==null)
        {
            System.out.println("No available parking spots for vehcile type :"+ vehcile.getVehcileType());
            return null;
        }

        boolean isParked = parkingSpot.parkVehcile(vehcile);
        if(isParked){
            System.out.println("Vehcile with " + vehcile.getVehcileType()+" is parked in Parking spot :"+parkingSpot.getParkingSpotId());
        }
        else{
            System.out.println("Vehcile was not parked");
        }
        Ticket ticket = new Ticket(vehcile,parkingSpot.getParkingSpotId());
        System.out.println("TicketManager.Ticket has been issued for vehcile :"+ vehcile.getId() + " with ticket number "+ ticket.getTicketNumber());
        return ticket;

    }
}
