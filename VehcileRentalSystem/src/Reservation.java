public class Reservation {
    private ReservedDates reservedDates;
    private Vehcile vehcile;

    public Reservation(ReservedDates reservedDates, Vehcile vehcile) {
        this.reservedDates = reservedDates;
        this.vehcile = vehcile;
    }

    public boolean reserve() {
        if (this.vehcile == null) {
            System.out.println("\nNo Vehcile Selected to reserve\n");
            return false;
        } else {
            if (this.vehcile.getReservedDates() != null) {
                this.vehcile.getReservedDates().endDate = this.reservedDates.getEndDate();
                this.vehcile.setVehcileStatus(VehcileStatus.NOTAVAILABLE);

            }
            else{
                ReservedDates reservedDates = new ReservedDates(this.reservedDates.getStartDate(), this.reservedDates.getEndDate());
                this.vehcile.setReservedDates(reservedDates);
            }
            System.out.println("This Vehcile is Reserved until " + this.vehcile.getReservedDates().endDate + "From start Date :" + this
                    .vehcile.getReservedDates().startDate);

            return true;

        }
    }
}
