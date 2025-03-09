import EntranceExitModules.EntranceGate;
import ParkingLotImplementation.ParkingLot;
import TicketManager.Ticket;
import VehcileManager.Vehcile;
import VehcileManager.VehcileType;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        List<BaseParkingSpot> twoWheelerSpots = new ArrayList<>();
//        List<BaseParkingSpot> fourWheelerSpots = new ArrayList<>();
//        twoWheelerSpots.add(new TwoWheelerParkingSpot(1,10,4));
//        twoWheelerSpots.add(new TwoWheelerParkingSpot(2,10,10));
//        twoWheelerSpots.add(new TwoWheelerParkingSpot(3,12,3));
//        fourWheelerSpots.add(new FourWheelerParkingSpot(4,20,10));
//
//        ParkingStrategy nearestAvailableParkingStrategy = new NearestAvailableParkingSpotStrategy();
////        ParkingLotManager twoWheelerParkingmanager = new TwoWheelerParkingSpotManager(twoWheelerSpots,nearestAvailableParkingStrategy);
////        ParkingLotManager fourWheelerParkingManager = new FourWheelerParkingSpotManager(fourWheelerSpots,nearestAvailableParkingStrategy);
//        ParkingSpotManagerFactory parkingSpotManagerFactory = new ParkingSpotManagerFactory();
//        ParkingLotManager twoWheelerParkingmanager =parkingSpotManagerFactory.getParkingLotManger(VehcileType.TWOWHEELER,twoWheelerSpots,nearestAvailableParkingStrategy);
//        ParkingLotManager fourWheelerParkingManager =parkingSpotManagerFactory.getParkingLotManger(VehcileType.FOURWHEELER,fourWheelerSpots,nearestAvailableParkingStrategy);
//        Vehcile vehcile = new Vehcile("bike123", VehcileType.TWOWHEELER);
//        twoWheelerParkingmanager.parkVehcile(vehcile);
//        fourWheelerParkingManager .parkVehcile(vehcile);
        ParkingLot singletonInstance = ParkingLot.getSingletonInstance(1234,5,5);
        EntranceGate entranceGate1 = new EntranceGate(singletonInstance);
        Vehcile vehcile = new Vehcile("Camryy",VehcileType.FOURWHEELER);
        Ticket carTicket = entranceGate1.issueTicket(vehcile);
        if (carTicket != null) {
            System.out.println("Car parked successfully!");
            System.out.println("Vehicle: " + carTicket.getVehcile().getId());
            System.out.println("Parked at Spot ID: " + carTicket.getParkingSpotId());
            System.out.println("Timestamp: " + carTicket.getTimeStamp());

        } else {
            System.out.println("Failed to park bike.");
        }
        Vehcile bike = new Vehcile("Bike123", VehcileType.TWOWHEELER);
        Ticket bikeTicket = entranceGate1.issueTicket(bike);

        if (bikeTicket != null) {
            System.out.println("Bike parked successfully!");
            System.out.println("Vehicle: " + bikeTicket.getVehcile().getId());
            System.out.println("Parked at Spot ID: " + bikeTicket.getParkingSpotId());
            System.out.println("Timestamp: " + bikeTicket.getTimeStamp());
        } else {
            System.out.println("Failed to park bike.");
        }

        }
    }
