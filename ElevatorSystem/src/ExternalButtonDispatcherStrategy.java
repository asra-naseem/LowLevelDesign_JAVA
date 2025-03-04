import java.util.List;

public interface ExternalButtonDispatcherStrategy {
    public void dispatchingStrategy(List<ElevatorController> elevatorController, int floor, Direction direction);
}
