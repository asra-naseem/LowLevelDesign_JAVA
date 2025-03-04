import java.util.List;

public class InternalDispatcher {

    List<ElevatorController>elevatorControllerList = ElevatorCreator.elevatorControllerList;

    public void submitInternalRequest(int destination, ElevatorCar elevatorCar) {
     for(ElevatorController controller:elevatorControllerList){
         if(controller.elevatorCar.id == elevatorCar.id){
             System.out.println(controller.elevatorCar.id + ""+elevatorCar.id);
             controller.submitInternalRequest(destination);
             controller.controlElevator();
         }
     }

    }
}
