package com.jsp.wmi.controller;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.wmi.requestdto.AdminRequest;
import com.jsp.wmi.requestdto.WarehouseRequest;
import com.jsp.wmi.responsedto.AdminResponse;
import com.jsp.wmi.responsedto.WarehouseResponse;
import com.jsp.wmi.service.AdminService;
import com.jsp.wmi.service.WarehouseService;
import com.jsp.wmi.util.ResponseStructure;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;

@RestController
public class WarehouseController {
	@Autowired
	private WarehouseService warehouseService;

	@PostMapping("/warehouses")
	public ResponseEntity<ResponseStructure<WarehouseResponse>> createWareHouse(@RequestBody WarehouseRequest wareHouseRequest)
	{
		return warehouseService.createWarehouse(wareHouseRequest);


	}

	@GetMapping("/warehouses")
	public String createWarehouse() {
		return "Warehouse";
	}
}
