package com.jsp.wmi.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.jsp.wmi.entity.Admin;
import com.jsp.wmi.requestdto.AdminRequest;
import com.jsp.wmi.responsedto.AdminResponse;
import com.jsp.wmi.security.SecurityConfig;

@Component
public class AdminMapper {
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public Admin mapToAdmin(AdminRequest adminRequest,Admin admin) {
		admin.setAdminName(adminRequest.getAdminName());
		admin.setAdminEmail(adminRequest.getAdminEmail());
		admin.setAdminPassword(passwordEncoder.encode(adminRequest.getAdminPassword()));
		
		return admin;
	}
	public AdminResponse mapToAdminResponse(Admin admin) {
		return AdminResponse.builder()
				.adminId(admin.getAdminId())
				.adminName(admin.getAdminName())
				.adminEmail(admin.getAdminEmail())
				.adminType(admin.getAdminType())
				
				.build();

	}
}
