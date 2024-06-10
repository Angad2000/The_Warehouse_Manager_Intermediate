package com.jsp.wmi.responsedto;

import java.util.List;

import com.jsp.wmi.enums.AdminType;
import com.jsp.wmi.enums.Privilege;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AdminResponse {
	private int adminId;
	private String adminName;
	private String adminEmail;
	private AdminType adminType;
	private Privilege privilege;
	

}
