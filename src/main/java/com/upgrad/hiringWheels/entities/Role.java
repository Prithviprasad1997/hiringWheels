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
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int role_id;

    @Column(name = "role_name" , unique = true ,nullable = false)
    private String roleName;

    @OneToMany(mappedBy = "role")
    private List<Users> usersList;

    public Role() {
    }

    public Role(String roleName) {
        this.roleName = roleName;
        this.usersList = usersList;
    }

    public Role(String roleName, List<Users> usersList) {
        this.roleName = roleName;
        this.usersList = usersList;
    }
}
