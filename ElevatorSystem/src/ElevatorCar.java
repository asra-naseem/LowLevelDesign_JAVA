public class ElevatorCar {
   public int id;
   public Display display;
   public InternalButton internalButton;
   public Status elevatorStatus;
   public int currFloor;
   public Direction currDirection;
   public InternalDispatcher internalDispatcher;

   public ElevatorCar(int id,Building building) {
      this.id = id;
      this.display = new Display();
      this.internalDispatcher=new InternalDispatcher();
      this.internalButton = new InternalButton(internalDispatcher,building);
      this.currFloor = 0;
      this.elevatorStatus = Status.IDLE;
      this.currDirection = Direction.UP;
   }
   public void showDisplay(){
      display.showDisplay();
   }
   public void setDisplay() {
      this.display.setDisplay(currFloor, currDirection);
   }

   public void pressButton(int destination){
      internalButton.pressButton(destination,this);
  }
  public boolean moveElevator(Direction direction,int destination){
     int startFloor = currFloor;
      if(direction==Direction.UP){
         for(int i=startFloor+1;i<destination;i++){
            this.currFloor = i;
            setDisplay();
            showDisplay();
            if(i == destination) {
               return true;
            }

         }

      }
      else{

         for(int i=startFloor-1;i>=destination;i--){
            this.currFloor = i;
            setDisplay();
            showDisplay();
            if(i == destination) {
               return true;
            }

         }

      }
      return false;
  }

}
