package com.upgrad.hiringWheels.daos;

import com.upgrad.hiringWheels.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleDAO extends JpaRepository<Vehicle,Integer> {
}
