package com.jsp.wmi.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.jsp.wmi.repository.AdminRepository;

import lombok.AllArgsConstructor;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

	@Autowired
	private AdminRepository adminRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return adminRepository.findByadminEmail(username).map(UserDetailsImpl:: new).orElseThrow();
		
	}
	
	
		
}

