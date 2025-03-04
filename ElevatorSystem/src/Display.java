public class Display {
    int floor;
    Direction direction;

    public int getFloor() {
        return floor;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
    public void setDisplay(int floor ,Direction direction){
  this.floor=floor;
  this.direction=direction;
    }
    public void setFloor(int floor) {
        this.floor = floor;
    }
    public void showDisplay(){
        System.out.println(floor);
        System.out.println(direction);
    }
}
