import java.time.LocalDate;

public class Parking {

    //private String id;
    private Double slot;
    private LocalDate startTime;
    private String licencePlate;

    public Parking(Double slot, String licencePlate) {
        this.slot = slot;
        this.startTime = LocalDate.now();
        this.licencePlate = licencePlate;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public Double getSlot() {
        return slot;
    }

    public void setSlot(Double slot) {
        this.slot = slot;
    }
}
