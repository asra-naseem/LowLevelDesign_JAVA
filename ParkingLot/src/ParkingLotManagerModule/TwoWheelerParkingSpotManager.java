package ParkingLotManagerModule;

import ParkingSpot.BaseParkingSpot;
import ParkingStrategyModule.ParkingStrategy;

import java.util.List;

public class TwoWheelerParkingSpotManager extends ParkingLotManager{
    ParkingStrategy strategy ;
    public TwoWheelerParkingSpotManager(List<BaseParkingSpot> spots, ParkingStrategy strategy) {

        super(spots, strategy);
        this.strategy = strategy;

    }

}
