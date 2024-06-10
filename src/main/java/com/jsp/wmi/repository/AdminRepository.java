package com.jsp.wmi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.jsp.wmi.entity.Admin;
import com.jsp.wmi.enums.AdminType;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

	boolean existsByAdminType(AdminType superAdmin);


	Optional<Admin> findByadminEmail(String username);

	//boolean existByAdminType = false;

}
