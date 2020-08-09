package com.upgrad.hiringWheels.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Data
@Table(name = "vehicle_category")
public class Vehicle_category {
    @Id
    @Column(name = "vehicle_category_id")
    private int id;

    @Column(name = "vehicle_category_name", nullable = false, unique = true)
    private String vehicleCategoryName;

    @OneToMany(mappedBy = "vehicleCategory")
    List<Vehicle_Subcategory> vehicleSubcategories;
}