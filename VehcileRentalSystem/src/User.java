public class User {

    private int userId;
    private String username;
    private UserController userController;
    private Location location;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public User(String username, int userId, VehcileBookingStrategy vehcileBookingStrategy) {
        this.username = username;
        this.userId = userId;
        this.userController = new UserController(vehcileBookingStrategy);
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

   public void searchbyLocation(Location location)
   {
       userController.getStore(location);
   }
   public void reserveVehcile(VehcileType vehcileType){
        userController.reservingVehcile(vehcileType,location);
   }

}
