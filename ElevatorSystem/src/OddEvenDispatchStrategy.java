import java.util.List;

public class OddEvenDispatchStrategy implements ExternalButtonDispatcherStrategy{
    @Override
    public void dispatchingStrategy(List<ElevatorController> elevatorControllers, int floor, Direction direction) {
        for(ElevatorController controller:elevatorControllers){

            int elevatorId = controller.elevatorCar.id;
            if((elevatorId%2==1 && floor%2==1) || (elevatorId%2==0 && floor%2==0)) {
                controller.submitExternalRequest(floor, direction);
                 return ;
            }


        }
        System.out.println(" No suitable elevator controller found to process the request for the floor :"+floor);
    }
}
