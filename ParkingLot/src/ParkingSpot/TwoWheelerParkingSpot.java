package ParkingSpot;

import VehcileManager.Vehcile;
import VehcileManager.VehcileType;

public class TwoWheelerParkingSpot extends BaseParkingSpot{
    public TwoWheelerParkingSpot(int parkingSpotId, int price,int distanceFromEntrance) {
        super(parkingSpotId, price,distanceFromEntrance);
    }

    @Override
    public boolean parkVehcile(Vehcile vehcile) {
        if(isEmpty()==true && vehcile.vehcileType.equals(VehcileType.TWOWHEELER))
        {
            this.vehcile = vehcile;
            return true;
        }
        System.out.println("Vehcile cannot be Parked as the place is already occupied or the Vehcile type is not Two wheeler");
        return false;
    }

}
