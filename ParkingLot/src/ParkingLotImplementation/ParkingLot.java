package ParkingLotImplementation;

import FactoryModule.ParkingSpotManagerFactory;
import ParkingLotManagerModule.ParkingLotManager;
import ParkingSpot.BaseParkingSpot;
import ParkingSpot.FourWheelerParkingSpot;
import ParkingSpot.TwoWheelerParkingSpot;
import ParkingStrategyModule.NearestAvailableParkingSpotStrategy;
import ParkingStrategyModule.ParkingStrategy;
import ParkingStrategyModule.RandomParkingSpotStrategy;
import VehcileManager.VehcileType;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    private static ParkingLot singletonInstance;
    private static String parlingLotId;
    private List<BaseParkingSpot> twoWheelerParkingSpots;
    private List<BaseParkingSpot> fourWheelerParkingSpots;
    private ParkingSpotManagerFactory parkingSpotManagerFactory;
    private ParkingStrategy twoWheelerStrategy;
    private ParkingStrategy fourWheelerStrategy;
    private ParkingLotManager twoWheelerParkingSpotManager;
    private ParkingLotManager fourWheelerParkingSpotManager;

    public ParkingLot(String parlingLotId, int twoWheelerCount,int fourWheelerCount ) {
        this.parlingLotId = parlingLotId;
        this.twoWheelerParkingSpots = new ArrayList<>();

        for (int i = 1; i <= twoWheelerCount; i++) {
            this.twoWheelerParkingSpots.add(new TwoWheelerParkingSpot(i, 10, i * 5)); // Example: ID, price, distance
        }
        this.twoWheelerStrategy = new RandomParkingSpotStrategy();
        this.fourWheelerStrategy = new NearestAvailableParkingSpotStrategy();
        // Initialize four-wheeler parking spots
        this.fourWheelerParkingSpots = new ArrayList<>();
        for (int i = 1; i <= fourWheelerCount; i++) {
            this.fourWheelerParkingSpots.add(new FourWheelerParkingSpot(i + twoWheelerCount, 20, i * 10));
        }
        this.parkingSpotManagerFactory = new ParkingSpotManagerFactory();
        this.twoWheelerParkingSpotManager = parkingSpotManagerFactory.getParkingLotManger(VehcileType.TWOWHEELER,twoWheelerParkingSpots,twoWheelerStrategy);
        this.fourWheelerParkingSpotManager = parkingSpotManagerFactory.getParkingLotManger(VehcileType.FOURWHEELER,fourWheelerParkingSpots,fourWheelerStrategy);
    }

    public static synchronized ParkingLot getSingletonInstance(int parkingLotId,int twoWheelerCount,int fourWheelerCount ) {
        if ( singletonInstance==null)
            return new ParkingLot(parlingLotId,twoWheelerCount, fourWheelerCount);
        return singletonInstance;
    }
    public List<BaseParkingSpot> getTwoWheelerParkingSpots() {
        return twoWheelerParkingSpots;
    }

    public void setTwoWheelerParkingSpots(List<BaseParkingSpot> twoWheelerParkingSpots) {
        this.twoWheelerParkingSpots = twoWheelerParkingSpots;
    }

    public List<BaseParkingSpot> getFourWheelerParkingSpots() {
        return fourWheelerParkingSpots;
    }

    public void setFourWheelerParkingSpots(List<BaseParkingSpot> fourWheelerParkingSpots) {
        this.fourWheelerParkingSpots = fourWheelerParkingSpots;
    }

    public ParkingSpotManagerFactory getParkingSpotManagerFactory() {
        return parkingSpotManagerFactory;
    }

    public void setParkingSpotManagerFactory(ParkingSpotManagerFactory parkingSpotManagerFactory) {
        this.parkingSpotManagerFactory = parkingSpotManagerFactory;
    }

    public ParkingStrategy getTwoWheelerStrategy() {
        return twoWheelerStrategy;
    }

    public void setTwoWheelerStrategy(ParkingStrategy twoWheelerStrategy) {
        this.twoWheelerStrategy = twoWheelerStrategy;
    }

    public ParkingStrategy getFourWheelerStrategy() {
        return fourWheelerStrategy;
    }

    public void setFourWheelerStrategy(ParkingStrategy fourWheelerStrategy) {
        this.fourWheelerStrategy = fourWheelerStrategy;
    }

    public ParkingLotManager getTwoWheelerParkingSpotManager() {
        return twoWheelerParkingSpotManager;
    }

    public void setTwoWheelerParkingSpotManager(ParkingLotManager twoWheelerParkingSpotManager) {
        this.twoWheelerParkingSpotManager = twoWheelerParkingSpotManager;
    }

    public ParkingLotManager getFourWheelerParkingSpotManager() {
        return fourWheelerParkingSpotManager;
    }

    public void setFourWheelerParkingSpotManager(ParkingLotManager fourWheelerParkingSpotManager) {
        this.fourWheelerParkingSpotManager = fourWheelerParkingSpotManager;
    }

    public static String getParlingLotId() {
        return parlingLotId;
    }

    public static void setParlingLotId(String parlingLotId) {
        ParkingLot.parlingLotId = parlingLotId;
    }
}
