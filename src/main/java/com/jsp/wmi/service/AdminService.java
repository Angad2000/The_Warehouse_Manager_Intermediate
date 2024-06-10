package com.jsp.wmi.service;

import org.springframework.http.ResponseEntity;

import com.jsp.wmi.entity.Admin;
import com.jsp.wmi.requestdto.AdminRequest;
import com.jsp.wmi.responsedto.AdminResponse;
import com.jsp.wmi.util.ResponseStructure;

import jakarta.validation.Valid;

public interface AdminService {
	ResponseEntity<ResponseStructure<AdminResponse>> createSuperAdmin(AdminRequest adminRequest);

	ResponseEntity<ResponseStructure<AdminResponse>> createAdmin(@Valid AdminRequest adminRequest);

}
