package com.upgrad.hiringWheels.daos;

import com.upgrad.hiringWheels.entities.FuelType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuelTypeDAO extends JpaRepository<FuelType,Integer> {
}
