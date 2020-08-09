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
public class Location {

    @Id
    @Column(name = "location_id")
    private int id;

    @Column(name = "location_name" , nullable = false)
    private String locationName;

    @Column(nullable = false , columnDefinition = "VARCHAR2(100)")
    private String address;


    @ManyToOne
    @JoinColumn(name = "city_id")
    private City cityId;

    @Column(nullable = false)
    private String pincode;

    @OneToMany(mappedBy = "locationId")
    private List<Vehicle> vehicleList;
}