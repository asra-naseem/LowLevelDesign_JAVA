package PricingStrategyModule;

import CostComputationModule.BaseCostComputation;
import TicketManager.Ticket;
import VehcileManager.VehcileType;

public class PerDayPricingStrategy implements PricingStrategy{

        BaseCostComputation baseCostComputation;
        @Override
        public BaseCostComputation calculatePrice(Ticket ticket) {
            int twoWheelerPerDay = 60;
            int fourWheelerPerDay = 100;
            int durationInHours = convertMillisecsToHours(ticket);
            int totalCost = 0;
            if(ticket.vehcile.getVehcileType().equals(VehcileType.TWOWHEELER)){
                totalCost = twoWheelerPerDay * durationInHours;
            }
            else if(ticket.vehcile.getVehcileType().equals(VehcileType.FOURWHEELER)){

                totalCost = fourWheelerPerDay * durationInHours;

            }
            baseCostComputation.setPrice(totalCost);
            return baseCostComputation;

        }
        public int convertMillisecsToHours(Ticket ticket){
            long startTime = ticket.getTimeStamp();
            long endTime =  System.currentTimeMillis();

            long duration = endTime-startTime;

            return (int) (duration/(1000*60*60*24));
        }
    }


