package com.upgrad.hiringWheels.daos;

import com.upgrad.hiringWheels.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingDAO extends JpaRepository<Booking,Integer> {
}
