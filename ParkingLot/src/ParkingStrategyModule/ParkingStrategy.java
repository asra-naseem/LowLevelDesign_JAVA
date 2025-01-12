package ParkingStrategyModule;

import ParkingSpot.BaseParkingSpot;

import java.util.List;
import java.util.PriorityQueue;

public interface ParkingStrategy {

    BaseParkingSpot findParking(List<BaseParkingSpot> spots);
}
