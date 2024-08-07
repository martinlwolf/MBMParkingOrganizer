package com.mbm.service;

import com.mbm.modelo.Parking;

import java.util.List;

public interface ParkingService {

    public List<Parking> allCurrentParkings();

    public void saveParking(Parking parking);

    public Parking getParking(String licencePlate);

    public String initializeParkSystem(String licencePlate);

    public Parking newParking(String licencePlate);
}
