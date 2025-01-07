package WithStrategyPattern;

import WithStrategyPattern.Strategy.DriveStrategy;

public class Vehcile {

    public DriveStrategy driveObj;
    Vehcile(DriveStrategy driveObj){
        this.driveObj=driveObj;
    }
    public void drive(){
    driveObj.drive();
    }
}
