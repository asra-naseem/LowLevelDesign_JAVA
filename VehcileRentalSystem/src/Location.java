public class Location {

    private long zipcode;
    private String city;

    public String getCity() {
        return city;
    }

    public Location(String city, long zipcode) {
        this.city = city;
        this.zipcode = zipcode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getZipcode() {
        return zipcode;
    }

    public void setZipcode(long zipcode) {
        this.zipcode = zipcode;
    }
}
