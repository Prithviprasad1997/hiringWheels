package com.upgrad.hiringWheels.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Data
@Entity
@Getter
@Setter
public class Activity {

    @Id
    @Column(name = "activity_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "activity_type" , nullable = false , unique = true)
    private String activityType;

    @OneToMany(mappedBy = "activity")
    List<Request> requests;
}