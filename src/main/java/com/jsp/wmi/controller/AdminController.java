package com.jsp.wmi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.wmi.entity.Admin;
import com.jsp.wmi.enums.AdminType;
import com.jsp.wmi.requestdto.AdminRequest;
import com.jsp.wmi.responsedto.AdminResponse;
import com.jsp.wmi.service.AdminService;

import com.jsp.wmi.util.ResponseStructure;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/api/v1")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@PostMapping("/register")
	public ResponseEntity<ResponseStructure<AdminResponse>>  createSuperAdmin(@RequestBody @Valid AdminRequest adminRequest){
		return  adminService.createSuperAdmin(adminRequest);
	}
	@PostMapping("/warehouse/warehouseId/admins")
	public ResponseEntity<ResponseStructure<AdminResponse>> createAdmin(@RequestBody @Valid AdminRequest adminRequest){
	return adminService.createAdmin(adminRequest);
	}
	
	

}
