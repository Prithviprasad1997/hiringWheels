package com.upgrad.hiringWheels.daos;

import com.upgrad.hiringWheels.entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationDAO extends JpaRepository<Location,Integer> {
}
