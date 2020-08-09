package com.upgrad.hiringWheels.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Setter
@Getter
@Entity
@Data
public class FuelType {

    @Id
    @Column(name = "fuel_type_id")
    private int id;

    @Column(name = "fuel_type" , nullable = false , unique = true)
    private String fuelType;

    @OneToMany(mappedBy = "fuelType")
    List<Vehicle> vehicles;
}
