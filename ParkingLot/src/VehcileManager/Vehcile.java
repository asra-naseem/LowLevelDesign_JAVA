package VehcileManager;

public class Vehcile {
    public String id;
    public VehcileType vehcileType;

    public Vehcile( String id, VehcileType vehcileType) {
        this.id = id;
        this.vehcileType = vehcileType;
    }

    public VehcileType getVehcileType() {
        return vehcileType;
    }

    public void setVehcileType(VehcileType vehcileType) {
        this.vehcileType = vehcileType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
