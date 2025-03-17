public class Vehcile {
    private int vehcileId;
    private String vehcileNumber;
    private VehcileType vehcileType;
    private VehcileStatus status;
    private double mileage;
    private double kmdriven;
    private double priceperday;
    private VehcileStatus vehcileStatus;
    private ReservedDates reservedDates;

    public Vehcile(double priceperday, int vehcileId, String vehcileNumber, VehcileType vehcileType, VehcileStatus vehcileStatus) {
        this.priceperday = priceperday;
        this.vehcileId = vehcileId;
        this.vehcileNumber = vehcileNumber;
        this.vehcileType = vehcileType;
        this.vehcileStatus = vehcileStatus;
    }

    public ReservedDates getReservedDates() {
        return reservedDates;
    }

    public void setReservedDates(ReservedDates reservedDates) {
        this.reservedDates = reservedDates;
    }

    public double getPriceperday() {
        return priceperday;
    }

    public void setPriceperday(int priceperday) {
        this.priceperday = priceperday;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getKmdriven() {
        return kmdriven;
    }

    public void setKmdriven(double kmdriven) {
        this.kmdriven = kmdriven;
    }

    public VehcileStatus getVehcileStatus() {
        return vehcileStatus;
    }

    public void setVehcileStatus(VehcileStatus vehcileStatus) {
        this.vehcileStatus = vehcileStatus;
    }

    public int getVehcileId() {
        return vehcileId;
    }

    public void setVehcileId(int vehcileId) {
        this.vehcileId = vehcileId;
    }

    public String getVehcileNumber() {
        return vehcileNumber;
    }

    public void setVehcileNumber(String vehcileNumber) {
        this.vehcileNumber = vehcileNumber;
    }

    public VehcileType getVehcileType() {
        return vehcileType;
    }

    public void setVehcileType(VehcileType vehcileType) {
        this.vehcileType = vehcileType;
    }

    public VehcileStatus getStatus() {
        return status;
    }

    public void setStatus(VehcileStatus status) {
        this.status = status;
    }
}
