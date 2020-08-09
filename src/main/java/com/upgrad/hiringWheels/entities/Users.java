package com.upgrad.hiringWheels.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@Getter
@Setter
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="user_id")
    private int id;

    @Column(name = "first_name" , nullable = false )
    private String firstName;

    @Column( name = "last_name" )
    private String lastName;

    @Column(nullable = false )
    @Size(min =5)
    private String password;

    @Column(nullable = false,unique = true)
    private  String email;

    @Column(name = "mobile_no", nullable = false)
    private String mobileNumber;

    @Column(name = "wallet_money")
    private int walletMoney;
    @Column(nullable = false)
    private String role_id;

    @ManyToOne
    Role role;

    @OneToMany(mappedBy = "users")
    List<Booking> bookings;

    @OneToMany(mappedBy = "user")
    List<Vehicle> vehicles;

    @OneToMany(mappedBy = "users")
    List<Request> requests;

    public Users(){

    }

    public Users(String firstName, String lastName, String password, String email, String mobileNumber, int walletMoney,String role_id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.walletMoney = walletMoney;
        this.role_id = role_id;
    }


}
