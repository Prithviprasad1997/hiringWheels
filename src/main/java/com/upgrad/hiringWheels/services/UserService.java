package com.upgrad.hiringWheels.services;

import com.upgrad.hiringWheels.Exception.UserAlreadyExistsException;
import com.upgrad.hiringWheels.Exception.UserNotFoundException;
import com.upgrad.hiringWheels.entities.Users;

public interface UserService {
    public Users createUser(Users users) throws UserAlreadyExistsException;
    public Users getUser(Users users) throws UserNotFoundException;
}
