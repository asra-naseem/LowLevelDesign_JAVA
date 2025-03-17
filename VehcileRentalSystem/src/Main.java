import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {
        // Initialize stores and vehicles
        List<Vehcile> list1 = new ArrayList<>();
        list1.add(new Vehcile(44, 1, "AP2324", VehcileType.CAR, VehcileStatus.AVAILABLE));
        list1.add(new Vehcile(23, 2, "TS1234", VehcileType.CAR, VehcileStatus.AVAILABLE));
        VehcileInventory vehcileInventory1 = new VehcileInventory(1, list1);
        Location storeLocation = new Location("Fairfax", 22030);
        Store store1 = new Store(vehcileInventory1, storeLocation);

        List<Vehcile> list2 = new ArrayList<>();
        list2.add(new Vehcile(66, 3, "AP3454", VehcileType.BUS, VehcileStatus.AVAILABLE));
        list2.add(new Vehcile(56, 4, "AP1236", VehcileType.BUS, VehcileStatus.AVAILABLE));
        VehcileInventory vehcileInventory2 = new VehcileInventory(2, list2);
        Location storeLocation2 = new Location("Centreville", 22031);
        Store store2 = new Store(vehcileInventory2, storeLocation2);

        List<Store> stores = new ArrayList<>();
        stores.add(store1);
        stores.add(store2);

        VehicleRentalSystem vehicleRentalSystem = VehicleRentalSystem.getInstance();
        vehicleRentalSystem.initializeData(stores);

        Scanner scanner = new Scanner(System.in);
        boolean continueRequests = true;
        int maxRequests = 4; // Example limit
        int requestCount = 0;

        while (continueRequests && requestCount < maxRequests) {
            try {
                System.out.println("Enter user details (username, password): ");
                String username = scanner.nextLine();
                System.out.print("Enter password: ");
                String passwordStr = scanner.nextLine(); // Read password as string
                int password = Integer.parseInt(passwordStr); // Parse to int

                User user = new User(username, password, new CheapestPriceStrategy());
                user.setLocation(new Location("Fairfax", 22303));

                // Reserve vehicle without consuming input stream

                user.reserveVehcile(VehcileType.CAR);
                System.out.println("Do you want to continue? (yes/no):");
                try {
                    sleep(1300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                String response = scanner.nextLine().toLowerCase();
                if (response.equals("yes")) {
                    continueRequests = true;
                } else {
                    continueRequests = false;
                }

                requestCount++; // Increment request count
            } catch (NumberFormatException e) {
                System.out.println("Invalid input.");
                continue; // Skip to the next iteration if input is invalid
            } catch (NoSuchElementException e) {
                System.out.println("No more input available.");
                break;
            }
        }

        scanner.close(); // Close scanner after use
    }
}
