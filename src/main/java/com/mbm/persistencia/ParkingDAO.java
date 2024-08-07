package com.mbm.persistencia;

import com.mbm.modelo.Parking;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ParkingDAO extends CrudRepository<Parking, Integer> {
    @Query(
            """
            SELECT p FROM Parking p
            WHERE p.licencePlate = ?1
            """
    )
    public Parking findByLicensePlate(String license);

}
