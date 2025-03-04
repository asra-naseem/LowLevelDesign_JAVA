import java.util.List;

public class ExternalButtonDispacher {
public List<ElevatorController> elevatorControllerList ;
public ExternalButtonDispatcherStrategy externalButtonDispatcherStrategy;

public ExternalButtonDispacher(List<ElevatorController> elevatorControllerList,ExternalButtonDispatcherStrategy externalButtonDispatcherStrategy){
    this.elevatorControllerList=elevatorControllerList;
    this.externalButtonDispatcherStrategy = externalButtonDispatcherStrategy;
}
public void submitRequest(int floor,Direction direction){
 externalButtonDispatcherStrategy.dispatchingStrategy(elevatorControllerList,floor,direction);
}
}
