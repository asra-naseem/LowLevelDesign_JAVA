package ParkingSpot;

import VehcileManager.Vehcile;
import VehcileManager.VehcileType;

public class FourWheelerParkingSpot extends BaseParkingSpot{
    public FourWheelerParkingSpot(int parkingSpotId, int price,int distanceFromEntrance) {
        super(parkingSpotId, price,distanceFromEntrance);
    }
    public boolean parkVehcile(Vehcile vehcile) {
        if(isEmpty()==true && vehcile.vehcileType.equals(VehcileType.FOURWHEELER))
        {
            this.vehcile = vehcile;
            return true;
        }
        System.out.println("Vehcile cannot be Parked as the place is already occupied or the Vehcile type is not FOUR wheeler");
        return false;
    }
}
