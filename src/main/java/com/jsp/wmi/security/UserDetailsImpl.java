package com.jsp.wmi.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.jsp.wmi.entity.Admin;
import com.jsp.wmi.enums.Privilege;

import lombok.AllArgsConstructor;
@AllArgsConstructor
public class UserDetailsImpl  implements UserDetails{
	private Admin admin;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		return admin.getAdminType()
				    .getPrivileges()
				    .stream()
				    .map(Privilege->new SimpleGrantedAuthority(Privilege.name()))
				    		                                       .toList();
	}

	@Override
	public String getPassword() {
		
		return admin.getAdminPassword();
	}

	@Override
	public String getUsername() {
		
		return admin.getAdminEmail();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

}
