package PricingStrategyModule;

import CostComputationModule.BaseCostComputation;
import TicketManager.Ticket;

public interface PricingStrategy {

    public BaseCostComputation calculatePrice(Ticket ticket);
}
