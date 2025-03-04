import java.util.List;

public class InternalButton {

   public int [] availableButtons ;

   public int selectedButton=-1;

   public InternalDispatcher internalDispatcher;

    public InternalButton(InternalDispatcher internalDispatcher, Building building) {
        this.internalDispatcher = internalDispatcher;
        initializeAvailableButtons(building);
    }

    private void initializeAvailableButtons(Building building) {
        List<Floor> floors = building.getAllFloors();
        availableButtons = new int[floors.size()];
        for (int i = 0; i < floors.size(); i++) {
            availableButtons[i] = floors.get(i).getId();
        }
    }

    public void pressButton(int destination, ElevatorCar elevatorCar){
       if(destination>availableButtons.length)
       {
           System.out.println("Input is not valid");
           return;
       }
       for(int i=0;i<availableButtons.length;i++) {
       if(destination==availableButtons[i]) {
           selectedButton = destination;
           System.out.println("selected Button is"+selectedButton);
           break;
       }
       }
       internalDispatcher.submitInternalRequest(destination,elevatorCar);
       }
   }


