package com.jsp.wmi.service;

import org.springframework.http.ResponseEntity;

import com.jsp.wmi.requestdto.WarehouseRequest;
import com.jsp.wmi.responsedto.WarehouseResponse;
import com.jsp.wmi.util.ResponseStructure;

public interface WarehouseService {
	ResponseEntity<ResponseStructure<WarehouseResponse>> createWarehouse(WarehouseRequest warehouseRequest);

}
