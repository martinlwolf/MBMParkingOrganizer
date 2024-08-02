import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ParkSystem {

    private ArrayList<Parking> parkings;
    private SlotOrganizer organizer;
    private Double pricePerHour;

    public ParkSystem(Double pricePerHour) {
        this.pricePerHour = pricePerHour;
        parkings = new ArrayList<Parking>();
        organizer = new SlotOrganizer();
    }

    public Parking newParking(String licencePlate) {
        Parking newParking = new Parking(organizer.nextFreeSlot(), licencePlate);
        this.parkings.add(newParking);

        return newParking;
    }

    public String endParking(String licencePlate) {
        Parking parkingFound = this.parkings.stream()
                .filter(p-> p.getLicencePlate() == licencePlate)
                .findFirst().orElseThrow(() -> new NoSuchElementException("No parking found"));
        Long finalPrice =  Duration.between(parkingFound.getStartTime(), LocalTime.now()).toHours();
        return "The parking price is:" + this.pricePerHour * finalPrice + "Slot: " + parkingFound.getSlot();
    }

    public Double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(Double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }
}
