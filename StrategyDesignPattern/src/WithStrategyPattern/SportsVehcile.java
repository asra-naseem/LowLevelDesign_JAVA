package WithStrategyPattern;

import WithStrategyPattern.Strategy.SportsDriveStrategy;

public  class SportsVehcile extends Vehcile {
        public SportsVehcile() {
            super(new SportsDriveStrategy());
        }
    }
