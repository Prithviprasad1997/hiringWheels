package com.upgrad.hiringWheels.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@Data
@Entity
public class Booking {

    @Id
    @Column(name = "booking_id")
    private int id;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "vehicle_id" , nullable = false)
    private String vehicleId;

    @Column(name = "pickup_date" , nullable = false , columnDefinition = "DATE")
    private Date pickupDate;

    @Column(name = "dropoff_date" , nullable = false ,columnDefinition = "DATE")
    private Date dropoffDate;

    @Column(name = "booking_date" , nullable = false)
    private Date bookingDate;

    @Column(name = "location_id" , nullable = false)
    private String locationId;

    @Column(nullable = false , columnDefinition = "NUMBER(10,2)")
    private float amount;

    @ManyToOne
    @JoinColumn(name = "user_Id")
    Users users;

    @ManyToOne
    @JoinColumn(name = "vehicle_Id")
    Vehicle vehicle;

    @ManyToOne
    Location location;
}
