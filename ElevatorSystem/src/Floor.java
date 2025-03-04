import java.util.ArrayList;
import java.util.List;

public class Floor {
    private int id ;

    private ExternalButton externalButton;

    public Floor(int id) {
        this.id = id;
        externalButton= new ExternalButton(new ExternalButtonDispacher(ElevatorCreator.elevatorControllerList,new OddEvenDispatchStrategy()));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void pressExternalElevatorRequest(Direction direction){
        externalButton.pressButton(id,direction);
    }



}
