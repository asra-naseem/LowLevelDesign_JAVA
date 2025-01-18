package ParkingLotManagerModule;

import ParkingSpot.BaseParkingSpot;
import ParkingStrategyModule.ParkingStrategy;
import VehcileManager.Vehcile;

import java.util.List;

public abstract class ParkingLotManager {
List<BaseParkingSpot> spots ;
ParkingStrategy strtegyObj;
public  ParkingLotManager(List<BaseParkingSpot> spots,ParkingStrategy strtegyObj){
    this.spots=spots;
    this.strtegyObj=strtegyObj;
}
public BaseParkingSpot findParkingSpace(){
    return strtegyObj.findParking(spots);
}
public boolean parkVehcile(Vehcile vehcile){
    BaseParkingSpot spot = findParkingSpace();
   if(spot.parkVehcile(vehcile)) {
       System.out.println("Spot number:" + spot.getParkingSpotId());
       return true;
   }
   return false;

}
public void removeVehcile(Vehcile v){
    for(BaseParkingSpot spot : spots){
        if(spot.isEmpty()==false && spot.vehcile.equals(v)) {
            spot.removeVehcile(v);
            break;
        }
    }
}
}
