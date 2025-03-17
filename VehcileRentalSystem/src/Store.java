import java.util.ArrayList;
import java.util.List;

public class Store {
    public VehcileInventory vehcileInventory;
    public List<User>userList;
    public List<Reservation> reservationList;
    public Location location;

    public Store(VehcileInventory vehcileInventory, Location location) {
        this.vehcileInventory = vehcileInventory;
        this.location = location;
        reservationList = new ArrayList<>();
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public VehcileInventory getVehcileInventory() {
        return vehcileInventory;
    }

    public void setVehcileInventory(VehcileInventory vehcileInventory) {
        this.vehcileInventory = vehcileInventory;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }
}
