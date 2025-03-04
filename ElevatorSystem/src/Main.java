import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        // for internal request
        List<ElevatorController>elevatorControllerList = ElevatorCreator.elevatorControllerList;
        ElevatorCar car1 = elevatorControllerList.getFirst().elevatorCar;
        car1.pressButton(2);


    }
}