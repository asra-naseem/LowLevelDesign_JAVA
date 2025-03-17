import java.util.ArrayList;
import java.util.List;

public class VehicleRentalSystem {
    private List<User> userList;
    private List<Store> storeList;
    private static VehicleRentalSystem vehicleRentalSystem;

    private VehicleRentalSystem() {
        this.userList = new ArrayList<>(); // Initialize userList
        this.storeList = new ArrayList<>(); // Initialize storeList
    }

    public static VehicleRentalSystem getInstance() {
        if (vehicleRentalSystem == null) {
            vehicleRentalSystem = new VehicleRentalSystem();
        }
        return vehicleRentalSystem;
    }

    public void initializeData(List<Store> storeList) {
        this.storeList = storeList;
    }

    public List<Store> getStoreList() {
        return storeList;
    }

    public void setStoreList(List<Store> storeList) {
        this.storeList = storeList;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    // Assuming we have only one store in every zipcode
    public Store getStoreByLocation(Location userLocation) {
        for (Store store : storeList) {
            if (store.getLocation().getZipcode() == userLocation.getZipcode() || store.getLocation().getCity().equals(userLocation.getCity())) {
                return store;
            }
        }
        return null;
    }
}
