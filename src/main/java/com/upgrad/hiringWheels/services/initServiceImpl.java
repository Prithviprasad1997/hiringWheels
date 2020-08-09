package com.upgrad.hiringWheels.services;

import com.upgrad.hiringWheels.daos.*;
import com.upgrad.hiringWheels.entities.*;
import org.springframework.beans.factory.annotation.Autowired;

public class initServiceImpl implements initService{
    @Autowired
    RoleDAO roleDAO;
    @Autowired
    UsersDAO usersDAO;
    @Autowired
    Vehicle_categoryDAO vehicleCategoryDAO;
    @Autowired
    Vehicle_SubcategoryDAO vehicle_subcategoryDAO;
    @Autowired
    FuelTypeDAO fuelTypeDAO;
    @Autowired
    CityDAO cityDAO;
    @Autowired
    LocationDAO locationDAO;

    @Override
    public void insertData() {
        insertRoles();
        insertUser();
        insertVehicleCategory();
        insertVehicleSubCategory();
        inserFuelType();
        insertCity();
        insertLocation();
    }

    private void insertLocation() {
    }

    private void insertCity() {

    }

    private void inserFuelType() {
        FuelType petrol = new FuelType();
        petrol.setFuelType("Petrol");
        FuelType diesel = new FuelType();
        diesel.setFuelType("Diesel");
        fuelTypeDAO.save(petrol);
        fuelTypeDAO.save(diesel);
    }

    private void insertVehicleSubCategory() {
        Vehicle_Subcategory SUV = new Vehicle_Subcategory();
        SUV.setVehicleTypeName("SUV");
        SUV.setCostPerHour(300);
        vehicle_subcategoryDAO.save(SUV);
        Vehicle_Subcategory SEDAN = new Vehicle_Subcategory();
        SEDAN.setVehicleTypeName("SEDAN");
        SEDAN.setCostPerHour(350);
        vehicle_subcategoryDAO.save(SEDAN);
        Vehicle_Subcategory HATCHBACK = new Vehicle_Subcategory();
        HATCHBACK.setVehicleTypeName("HATCHBACK");
        HATCHBACK.setCostPerHour(250);
        vehicle_subcategoryDAO.save(HATCHBACK);
        Vehicle_Subcategory CRUISER	 = new Vehicle_Subcategory();
        CRUISER.setVehicleTypeName("CRUISER");
        CRUISER.setCostPerHour(200);
        vehicle_subcategoryDAO.save(CRUISER);
        Vehicle_Subcategory DIRTBIKE = new Vehicle_Subcategory();
        DIRTBIKE.setVehicleTypeName("DIRTBIKE");
        DIRTBIKE.setCostPerHour(200);
        vehicle_subcategoryDAO.save(DIRTBIKE);
        Vehicle_Subcategory SPORTSBIKE = new Vehicle_Subcategory();
        SPORTSBIKE.setVehicleTypeName("SPORTSBIKE");
        SPORTSBIKE.setCostPerHour(150);
        vehicle_subcategoryDAO.save(SPORTSBIKE);
    }

    private void insertVehicleCategory() {
        Vehicle_category car = new Vehicle_category();
        Vehicle_category bike = new Vehicle_category();
        car.setVehicleCategoryName("Car");
        bike.setVehicleCategoryName("Bike");
        vehicleCategoryDAO.save(car);
        vehicleCategoryDAO.save(bike);
    }

    private void insertUser() {
        Users user = new Users();
        user.setFirstName("Admin");
        user.setLastName("Admin");
        user.setMobileNumber("9999999999");
        user.setEmail("upgrad@gmail.com");
        user.setPassword("admin@123");
        user.setWalletMoney(100000);
        user.setRole(roleDAO.findByUserRoleName("Admin"));
        usersDAO.save(user);
    }

    private void insertRoles() {
        Role admin = new Role();
        admin.setRoleName("Admin");
        Role User = new Role();
        User.setRoleName("User");
        roleDAO.save(admin);
        roleDAO.save(User);
    }

}

