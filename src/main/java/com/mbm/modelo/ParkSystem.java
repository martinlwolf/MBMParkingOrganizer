package com.mbm.modelo;

import javax.persistence.*;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

@Entity
public class ParkSystem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Double pricePerHour;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Slot> slots;

    public ParkSystem(Double pricePerHour, List<Slot> slots) {
        this.pricePerHour = pricePerHour;
        this.slots = slots;
    }

    public ParkSystem() {

    }

/*    public Parking newParking(String licencePlate) {
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
    }*/

    public Double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(Double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }
}
