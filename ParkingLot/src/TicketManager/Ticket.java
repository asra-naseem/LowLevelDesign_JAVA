package TicketManager;

import VehcileManager.Vehcile;

public class Ticket {
    public Vehcile vehcile;
    public static int ticketCounter=0;
    public long ticketNumber;
    public long timeStamp;
    public int parkingSpotId;


    public Ticket(Vehcile vehcile,int parkingSpotId){
        this.vehcile=vehcile;
        this.parkingSpotId=parkingSpotId;
        this.ticketNumber=ticketCounter++;
        this.timeStamp= System.currentTimeMillis();


    }
    public Vehcile getVehcile(int parkingSpotId, Vehcile vehcile) {
        return vehcile;
    }

    public void setVehcile(Vehcile vehcile) {
        this.vehcile = vehcile;
    }

    public long getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(long ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public Vehcile getVehcile() {
        return vehcile;
    }

    public int getParkingSpotId() {
        return parkingSpotId;
    }

    public void setParkingSpotId(int parkingSpotId) {
        this.parkingSpotId = parkingSpotId;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
