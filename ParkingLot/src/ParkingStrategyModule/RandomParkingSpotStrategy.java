package ParkingStrategyModule;

import ParkingSpot.BaseParkingSpot;

import java.util.List;
import java.util.Random;

public class RandomParkingSpotStrategy implements ParkingStrategy{
    @Override
    public BaseParkingSpot findParking(List<BaseParkingSpot> spots) {
        List<BaseParkingSpot> availableSpots = spots.stream().filter(spot->spot.isEmpty()).toList();
        if(availableSpots.isEmpty()==true)
            return null;

        Random random = new Random();
        int randomIndex = random.nextInt(availableSpots.size());
        return availableSpots.get(randomIndex);
    }
}
