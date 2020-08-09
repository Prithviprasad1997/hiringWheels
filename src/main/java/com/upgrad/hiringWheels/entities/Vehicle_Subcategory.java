package com.upgrad.hiringWheels.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Data
@Entity
public class Vehicle_Subcategory {

    @Id
    @Column(name = "vehicle_type_id" )
    private int id;

    @Column(name = "vehicle_type_name" , nullable = false , unique = true)
    private String vehicleTypeName;

    @Column(name = "cost_per_hour" , nullable = false)
    private float costPerHour;


    @ManyToOne
    Vehicle_category vehicleCategory;

    @OneToMany(mappedBy = "vehicleSubcategory" )
    List<Vehicle> vehicle;
}
