package com.upgrad.hiringWheels.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Data
public class Vehicle {
    @Id
    @Column(name = "vehicle_id" ) @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "vehicle_model" , nullable = false)
    private String vehicleModel;

    @Column(name = "vehicle_number" )
    private String vehicleNumber;

    @Column(nullable = false )
    private String color;

    @Column(name = "vehicle_image_url" , nullable = false , columnDefinition = "VARCHAR2(500)")
    private String vehicleImageUrl;


    @ManyToOne
    Users user;

    @ManyToOne
    Vehicle_Subcategory vehicleSubcategory;

    @ManyToOne
    FuelType fuelType;

    @ManyToOne
    Location location;

    @OneToMany(mappedBy = "vehicle")
    List<Booking> booking;

    @OneToMany(mappedBy = "vehicle")
    List<Request> request;

    @ManyToOne
    Location locationId;

}
