package FactoryModule;

import ParkingLotManagerModule.FourWheelerParkingSpotManager;
import ParkingLotManagerModule.ParkingLotManager;
import ParkingLotManagerModule.TwoWheelerParkingSpotManager;
import ParkingSpot.BaseParkingSpot;
import ParkingStrategyModule.ParkingStrategy;
import VehcileManager.VehcileType;

import java.util.List;

public class ParkingSpotManagerFactory {

    public ParkingLotManager getParkingLotManger(VehcileType vehcileType, List<BaseParkingSpot> parkingspots, ParkingStrategy parkingStrategy){
        if(vehcileType.equals(VehcileType.TWOWHEELER))
            return new TwoWheelerParkingSpotManager(parkingspots,parkingStrategy);
        else if(vehcileType.equals(VehcileType.FOURWHEELER))
            return new FourWheelerParkingSpotManager(parkingspots,parkingStrategy);
        else
            throw new IllegalArgumentException("Unsupported Vehcile Type:"+vehcileType);
    }
}
