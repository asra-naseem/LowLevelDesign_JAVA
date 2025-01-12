package ParkingLotManagerModule;

import ParkingSpot.BaseParkingSpot;
import ParkingStrategyModule.ParkingStrategy;

import java.util.List;

public class FourWheelerParkingSpotManager extends ParkingLotManager {

    public FourWheelerParkingSpotManager(List<BaseParkingSpot> spots, ParkingStrategy strtegyObj) {
        super(spots, strtegyObj);
    }
}
