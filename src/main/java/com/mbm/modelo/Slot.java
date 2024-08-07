package com.mbm.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Slot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int slotNumber;

    private boolean available;

    public Slot(int slotNumber) {
        this.slotNumber = slotNumber;
        this.available = true;
    }
}