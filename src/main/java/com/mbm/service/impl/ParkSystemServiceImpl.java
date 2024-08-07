package com.mbm.service.impl;

import com.mbm.modelo.Parking;
import com.mbm.persistencia.ParkingDAO;
import com.mbm.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ParkSystemServiceImpl implements ParkingService {

    @Autowired ParkingDAO parkingDAO;

    @Override
    public List<Parking> allCurrentParkings() {
        return (List<Parking>) parkingDAO.findAll();
    }

    @Override
    public void saveParking(Parking parking) {
        parkingDAO.save(parking);
    }

    @Override
    public Parking getParking(String licencePlate) {
        return parkingDAO.findByLicensePlate(licencePlate);
    }

    @Override
    public String initializeParkSystem(String licencePlate) {



        return "";
    }

    @Override
    public Parking newParking(String licencePlate) {
        return null;
    }


}
