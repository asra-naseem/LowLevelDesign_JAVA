package FactoryModule;

import CostComputationModule.BaseCostComputation;
import CostComputationModule.FourWheelerCostComputation;
import CostComputationModule.TwoWheelerCostComputation;
import PricingStrategyModule.PricingStrategy;
import VehcileManager.Vehcile;
import VehcileManager.VehcileType;

public class CostComputationFactory {
    public BaseCostComputation baseCostComputation;
    public PricingStrategy pricingStrategy;
    public BaseCostComputation getBaseCostComputationType(Vehcile vehcile){
        if(vehcile.getVehcileType().equals(VehcileType.FOURWHEELER))
            return new FourWheelerCostComputation(pricingStrategy);
        else
            return new TwoWheelerCostComputation(pricingStrategy);
    }
}
