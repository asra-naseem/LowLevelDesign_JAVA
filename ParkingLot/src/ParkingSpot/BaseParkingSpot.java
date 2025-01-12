package ParkingSpot;

import VehcileManager.Vehcile;
public abstract class BaseParkingSpot {
  public int parkingSpotId;
  public Vehcile vehcile;
  private int price ;

    public Vehcile getVehcile() {
        return vehcile;
    }

    public int getParkingSpotId() {
        return parkingSpotId;
    }

    public int getDistanceFromEntrance() {
        return distanceFromEntrance;
    }

    private int distanceFromEntrance;

  public BaseParkingSpot(int parkingSpotId,int price,int distanceFromEntrance) {
    this.parkingSpotId = parkingSpotId;
    this.vehcile=null;
    this.price = price;
    this.distanceFromEntrance=distanceFromEntrance;


  }

  public boolean isEmpty(){
    if(this.vehcile==null)
      return true;
    else
      return false;

  }
 public int getPrice(){
    return this.price;
  }
 public abstract boolean parkVehcile(Vehcile vehcile);

 public boolean removeVehcile(Vehcile vehcile){
    if(isEmpty()==false){
        this.vehcile=null;
        return true;
    }
    System.out.println("There is no Vehcile Parked ");
    return false;
 }
}
