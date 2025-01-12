package ParkingStrategyModule;

import ParkingSpot.BaseParkingSpot;

import java.util.List;
import java.util.PriorityQueue;

public class NearestAvailableParkingSpotStrategy implements ParkingStrategy{
    @Override
    public BaseParkingSpot findParking(List<BaseParkingSpot> spots) {
        PriorityQueue<BaseParkingSpot> minHeap = new PriorityQueue<>((a,b)->Integer.compare(a.getDistanceFromEntrance(), b.getDistanceFromEntrance()));

        // Adding only available spots
        for(BaseParkingSpot spot : spots){
            if(spot.isEmpty()==true)
                minHeap.add(spot);
        }
        return minHeap.isEmpty()? null : minHeap.poll();
    }
}
