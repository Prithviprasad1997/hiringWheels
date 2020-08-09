package com.upgrad.hiringWheels.daos;

import com.upgrad.hiringWheels.entities.Vehicle_category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Vehicle_categoryDAO extends JpaRepository<Vehicle_category,Integer> {

}
