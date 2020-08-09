package com.upgrad.hiringWheels.daos;

import com.upgrad.hiringWheels.entities.Vehicle_Subcategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Vehicle_SubcategoryDAO extends JpaRepository<Vehicle_Subcategory,Integer> {
}
