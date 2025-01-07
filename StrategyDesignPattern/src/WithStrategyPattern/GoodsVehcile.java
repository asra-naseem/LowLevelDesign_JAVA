package WithStrategyPattern;

import WithStrategyPattern.Strategy.NormalDriveStrategy;

public class GoodsVehcile extends Vehcile{
    public GoodsVehcile(){
        super(new NormalDriveStrategy());
    }



}
