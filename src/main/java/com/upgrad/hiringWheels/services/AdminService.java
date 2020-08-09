package com.upgrad.hiringWheels.services;

import com.upgrad.hiringWheels.Exception.UserNotRegisterException;
import com.upgrad.hiringWheels.entities.Vehicle;

public interface AdminService {
    public Vehicle registerVehicle(Vehicle vehicle) throws UserNotRegisterException;
}
