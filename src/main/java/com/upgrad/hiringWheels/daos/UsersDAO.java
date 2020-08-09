package com.upgrad.hiringWheels.daos;

import com.upgrad.hiringWheels.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository("usersDAO")
public interface UsersDAO extends JpaRepository<Users,Integer> {

    @Query("From Users u Where u.email = :email")
    Users checkEmailId(@Param("email") String email);

    @Query("From Users u Where u.mobileNumber = :mobileNumber")
    Users checkMobileNumber(@Param("mobileNumber") String mobileNumber);
}
