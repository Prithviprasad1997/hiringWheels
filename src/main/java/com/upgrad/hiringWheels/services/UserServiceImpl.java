package com.upgrad.hiringWheels.services;

import com.upgrad.hiringWheels.Exception.UserAlreadyExistsException;
import com.upgrad.hiringWheels.Exception.UserNotFoundException;
import com.upgrad.hiringWheels.daos.UsersDAO;
import com.upgrad.hiringWheels.entities.Users;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService{
    @Autowired
    UsersDAO usersDAO;

    @Override
    public Users createUser(Users users) throws UserAlreadyExistsException {

        Users emailId = usersDAO.checkEmailId(users.getEmail());
        Users mobileNumber = usersDAO.checkMobileNumber(users.getMobileNumber());

        if(emailId != null)
            throw new UserAlreadyExistsException("Email Already Exists");
        if(mobileNumber != null)
            throw new UserAlreadyExistsException("Mobile Number Already Exists");
        return usersDAO.save(users);
    }

    @Override
    public Users getUser(Users users) throws UserNotFoundException {
        Users Check = usersDAO.checkEmailId(users.getEmail());

        if(Check == null)
            throw new UserNotFoundException("User not Registered");
        if( !(Check.getPassword()).equals(users.getPassword()) )
            throw new UserNotFoundException("Unauthorized User");
        return Check;
    }
}
