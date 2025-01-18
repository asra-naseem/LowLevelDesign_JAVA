package CostComputationModule;

import PricingStrategyModule.PricingStrategy;
import TicketManager.Ticket;

public class BaseCostComputation {
    public Ticket ticket;
    public int price ;
    PricingStrategy strategy;
    public BaseCostComputation(PricingStrategy strategy){
        this.strategy = strategy;
    }
    public BaseCostComputation findTicketPrice(Ticket ticket){
       return strategy.calculatePrice(ticket);
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
