package com.upgrad.hiringWheels.daos;

import com.upgrad.hiringWheels.entities.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityDAO extends JpaRepository<Activity,Integer> {
}
