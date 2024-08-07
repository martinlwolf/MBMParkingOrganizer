package com.mbm.modelo;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Parking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Double slot;
    private LocalDate startTime;
    @Column(nullable = false, length = 7, unique = true)
    private String licencePlate;

    public Parking(Double slot, String licencePlate) {
        this.slot = slot;
        this.startTime = LocalDate.now();
        this.licencePlate = licencePlate;
    }

    public Parking() {

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

    public LocalDate getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDate startTime) {
        this.startTime = startTime;
    }
}
