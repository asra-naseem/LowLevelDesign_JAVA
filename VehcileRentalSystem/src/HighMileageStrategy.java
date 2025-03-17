import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HighMileageStrategy implements VehcileBookingStrategy{
    @Override
    public Vehcile selectVehcile(VehcileType vehcileType, Store store, ReservedDates reservedDates) {
        VehcileInventory vehcileInventory = store.getVehcileInventory();
        List<Vehcile>vehcileList = vehcileInventory.getVehcileList();
        List<Vehcile>filteredList = vehcileList.stream().filter(vehcile -> vehcile.getVehcileType()==vehcileType && !isReserved(vehcile,reservedDates)).collect(Collectors.toUnmodifiableList());
        Vehcile cheapVehcile = filteredList.stream().max(Comparator.comparingDouble(Vehcile::getMileage)).orElse(null);
        return cheapVehcile;

    }

    private boolean isReserved(Vehcile vehcile, ReservedDates reservedDates) {

        LocalDate reservationStartDate = reservedDates.getStartDate();
        LocalDate reservationEndDate = reservedDates.getEndDate();

        LocalDate vehcileReservedStartDate = vehcile.getReservedDates().startDate;
        LocalDate vehcileReservedEndDate = vehcile.getReservedDates().endDate;

        return reservationStartDate.isBefore(vehcileReservedEndDate) && reservationEndDate.isAfter(vehcileReservedStartDate);

    }
}
