import java.util.ArrayList;
import java.util.List;

public class ElevatorCreator {
    static List<ElevatorController>elevatorControllerList = new ArrayList<>();
    static {
        Floor Floor1 = new Floor(1);
        Floor Floor2 = new Floor(2);
        Floor Floor3 = new Floor(3);
        Floor Floor4= new Floor(4);
        List<Floor> FloorList = new ArrayList<>();
        FloorList.add(Floor1);
        FloorList.add(Floor2);
        FloorList.add(Floor3);
        FloorList.add(Floor4);

        Building building = new Building(FloorList);

        ElevatorCar car1 = new ElevatorCar(1,building);
        ElevatorCar car2 = new ElevatorCar(2,building);
        ElevatorController controller1 = new ElevatorController(car1);
        ElevatorController controller2 = new ElevatorController(car2);
        elevatorControllerList.add(controller1);
        elevatorControllerList.add(controller2);
    }
}
