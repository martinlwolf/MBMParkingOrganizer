import java.util.ArrayList;

public class ParkSystem {

    private ArrayList<Parking> parkings;
    private SlotOrganizer organizer;

    public Parking newParking(String licencePlate) {
        Parking newParking = new Parking(organizer.nextFreeSlot(), licencePlate);
        this.parkings.add(newParking);

        return newParking;
    }
}
