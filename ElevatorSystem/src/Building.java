import java.util.List;

public class Building {
    private List<Floor> floorList ;
    public Building(List<Floor> floorList){
        this.floorList=floorList;
    }
    public void addFloors(Floor newFloor){
        floorList.add(newFloor);
    }

    public void setFloorList(List<Floor> floorList) {
        this.floorList = floorList;
    }

    public void removeFloor(Floor removeFloor){
        floorList.remove(removeFloor);
    }
    public List<Floor> getAllFloors(){
        return floorList;
    }
}
