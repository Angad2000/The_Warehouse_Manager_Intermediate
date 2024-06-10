package com.jsp.wmi.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.wmi.repository.WarehouseRepository;
import com.jsp.wmi.requestdto.WarehouseRequest;
import com.jsp.wmi.responsedto.WarehouseResponse;
import com.jsp.wmi.service.WarehouseService;
import com.jsp.wmi.util.ResponseStructure;

import lombok.Setter;
@Service
public class WarehouseServiceImpl implements WarehouseService {
	@Autowired
	private WarehouseRepository warehouse;
	
	@Override
public ResponseEntity<ResponseStructure<WarehouseResponse>> createWarehouse(WarehouseRequest warehouseRequest) {
		
		return null;
	
	}
}
