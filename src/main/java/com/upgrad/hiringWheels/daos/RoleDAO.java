package com.upgrad.hiringWheels.daos;

import com.upgrad.hiringWheels.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("roleDAO")
public interface RoleDAO extends JpaRepository<Role,Integer> {
    Role findByUserRoleName(String Role);
}
