package com.upgrad.hiringWheels.services;

import com.upgrad.hiringWheels.Exception.UserNotRegisterException;
import com.upgrad.hiringWheels.daos.VehicleDAO;
import com.upgrad.hiringWheels.entities.Role;
import com.upgrad.hiringWheels.entities.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;

public class AdminServiceImpl implements AdminService {

    @Autowired
    VehicleDAO vehicleDAO;

    @Override
    public Vehicle registerVehicle(Vehicle vehicle) throws UserNotRegisterException {
        String role;
        role = vehicle.getUser().getRole_id();
        if(role == "1"){
            vehicleDAO.save(vehicle);
        }
        else {
            new UserNotRegisterException("Only Admin can register");
        }
        return vehicle;
    }
}
