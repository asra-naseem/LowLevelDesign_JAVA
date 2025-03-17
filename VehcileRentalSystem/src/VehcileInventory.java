import java.util.List;

public class VehcileInventory {
    private int vehcileInventoryId;

    public VehcileInventory(int vehcileInventoryId, List<Vehcile> vehcileList) {
        this.vehcileInventoryId = vehcileInventoryId;
        this.vehcileList = vehcileList;
    }

    public List<Vehcile> vehcileList;

    public List<Vehcile> getVehcileList() {
        return vehcileList;
    }

    public VehcileInventory(List<Vehcile> vehcileList) {
        this.vehcileList = vehcileList;
    }

    public void setVehcileList(List<Vehcile> vehcileList) {
        this.vehcileList = vehcileList;
    }
    public boolean isVehcileAvailableInList(Vehcile vehcile){
        for(Vehcile v:vehcileList) {
            if(vehcileList.equals(vehcile))
                return true;
        }
        return false;
    }
    public boolean updateVehcileInfo(Vehcile vehcile)
    {
        return false;
    }


}
