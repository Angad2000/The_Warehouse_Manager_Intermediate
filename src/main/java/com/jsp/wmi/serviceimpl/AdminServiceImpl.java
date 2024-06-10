package com.jsp.wmi.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.wmi.entity.Admin;
import com.jsp.wmi.enums.AdminType;
import com.jsp.wmi.exception.IllegalOperationException;
import com.jsp.wmi.mapper.AdminMapper;
import com.jsp.wmi.repository.AdminRepository;
import com.jsp.wmi.requestdto.AdminRequest;
import com.jsp.wmi.responsedto.AdminResponse;
import com.jsp.wmi.service.AdminService;
import com.jsp.wmi.util.ResponseStructure;

import jakarta.validation.Valid;

@Service
public class AdminServiceImpl implements AdminService{
	@Autowired
	private AdminRepository adminRepository;
	@Autowired
	private AdminMapper adminMapper;

	@Override
	public ResponseEntity<ResponseStructure<AdminResponse>> createSuperAdmin(AdminRequest adminRequest){
		if(adminRepository.existsByAdminType(AdminType.SUPER_ADMIN)) {
			throw new IllegalOperationException("A super Admin already exists");
		}
		Admin admin = adminMapper.mapToAdmin(adminRequest, new Admin());
		admin.setAdminType(AdminType.SUPER_ADMIN);
		admin = adminRepository.save(admin);

		AdminResponse response = adminMapper.mapToAdminResponse(admin);
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(new ResponseStructure<AdminResponse>()
						.setData(response)
						.setStatus(HttpStatus.CREATED.value())
						.setMessage("Admin Created"));


	}

	@Override
	public ResponseEntity<ResponseStructure<AdminResponse>> createAdmin(@Valid AdminRequest adminRequest) {
		// TODO Auto-generated method stub
		return null;
	}

}
