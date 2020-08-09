package com.upgrad.hiringWheels.daos;

import com.upgrad.hiringWheels.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityDAO extends JpaRepository<City,Integer> {
}
