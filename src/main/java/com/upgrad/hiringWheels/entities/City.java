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
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int city_id;

    @Column(name = "city_name" , nullable = false , unique = true)
    private String cityName;

    @OneToMany(mappedBy = "cityId")
    private List<Location> locations;
}


