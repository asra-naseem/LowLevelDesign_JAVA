import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;


public class UserController {
    private VehicleRentalSystem vehicleRentalSystem=VehicleRentalSystem.getInstance();
    private VehcileBookingStrategy vehcileBookingStrategy;

    public UserController(VehcileBookingStrategy vehcileBookingStrategy) {
        this.vehcileBookingStrategy = vehcileBookingStrategy;
    }

    public void getStore(Location location) {
        vehicleRentalSystem.getStoreByLocation(location);
    }

    public void reservingVehcile(VehcileType vehcileType,Location location) {
        Store store = vehicleRentalSystem.getStoreByLocation(location);
        if(store==null)
        {
            System.out.println("Store is unavailable at the location: "+location.getCity()+""+location.getZipcode());
            return;
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Today's date is: " + LocalDate.now());
        System.out.print("Enter start date (yyyy-MM-dd): ");
        String startDateStr = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate startDate = LocalDate.parse(startDateStr, formatter);

        System.out.print("Enter number of days you want to reserve the vehicle: ");
        int days = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        LocalDate endDate = startDate.plusDays(days);

        System.out.println("Start Date: " + startDate);
        System.out.println("End Date: " + endDate);

        scanner.close();
        ReservedDates reservedDates = new ReservedDates(startDate,endDate);
        Vehcile selectedVehcile =vehcileBookingStrategy.selectVehcile(vehcileType,store,reservedDates);
        if(selectedVehcile==null)
        {
            System.out.println("Vehcile is not present in the Inventory");
            return;
        }
        Reservation reservation = new Reservation(reservedDates,selectedVehcile);
       if( reservation.reserve()==true) {
           System.out.println("Your Registration is Successful, Please make the payment ");
           List<Reservation> reservations = store.getReservationList();
           reservations.add(reservation);
           store.setReservationList(reservations);
       }


    }
}
