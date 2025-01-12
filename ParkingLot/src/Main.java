import FactoryModule.ParkingSpotManagerFactory;
import ParkingLotManagerModule.FourWheelerParkingSpotManager;
import ParkingLotManagerModule.ParkingLotManager;
import ParkingLotManagerModule.TwoWheelerParkingSpotManager;
import ParkingSpot.BaseParkingSpot;
import ParkingSpot.FourWheelerParkingSpot;
import ParkingSpot.TwoWheelerParkingSpot;
import ParkingStrategyModule.NearestAvailableParkingSpotStrategy;
import ParkingStrategyModule.ParkingStrategy;
import VehcileManager.Vehcile;
import VehcileManager.VehcileType;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<BaseParkingSpot> twoWheelerSpots = new ArrayList<>();
        List<BaseParkingSpot> fourWheelerSpots = new ArrayList<>();
        twoWheelerSpots.add(new TwoWheelerParkingSpot(1,10,4));
        twoWheelerSpots.add(new TwoWheelerParkingSpot(2,10,10));
        twoWheelerSpots.add(new TwoWheelerParkingSpot(3,12,3));
        fourWheelerSpots.add(new FourWheelerParkingSpot(4,20,10));

        ParkingStrategy nearestAvailableParkingStrategy = new NearestAvailableParkingSpotStrategy();
//        ParkingLotManager twoWheelerParkingmanager = new TwoWheelerParkingSpotManager(twoWheelerSpots,nearestAvailableParkingStrategy);
//        ParkingLotManager fourWheelerParkingManager = new FourWheelerParkingSpotManager(fourWheelerSpots,nearestAvailableParkingStrategy);
        ParkingSpotManagerFactory parkingSpotManagerFactory = new ParkingSpotManagerFactory();
        ParkingLotManager twoWheelerParkingmanager =parkingSpotManagerFactory.getParkingLotManger(VehcileType.TWOWHEELER,twoWheelerSpots,nearestAvailableParkingStrategy);
        ParkingLotManager fourWheelerParkingManager =parkingSpotManagerFactory.getParkingLotManger(VehcileType.FOURWHEELER,fourWheelerSpots,nearestAvailableParkingStrategy);
        Vehcile vehcile = new Vehcile("bike123", VehcileType.TWOWHEELER);
        twoWheelerParkingmanager.parkVehcile(vehcile);
        fourWheelerParkingManager .parkVehcile(vehcile);
        }
    }
