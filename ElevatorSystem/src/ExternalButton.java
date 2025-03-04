public class ExternalButton {
    public Direction selectedDirection;
    public ExternalButtonDispacher externalButtonDispacher;

public ExternalButton(ExternalButtonDispacher externalButtonDispacher){
    this.externalButtonDispacher=externalButtonDispacher;
}
 void pressButton(int floor, Direction selectedDirection){
    externalButtonDispacher.submitRequest(floor,selectedDirection);

 }


}
