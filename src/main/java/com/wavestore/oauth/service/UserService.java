package com.wavestore.oauth.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.wavestore.oauth.client.UserFeignClient;
import com.wavestore.service.users.commons.models.entity.User;

@Service
public class UserService implements IUserService, UserDetailsService {

	private List<GrantedAuthority> authorities;	
	private UserDetails userDetails;
	private User user;	

	public UserService() {
		authorities = new ArrayList<GrantedAuthority>();
	}

	@Autowired
	private UserFeignClient userFeignClient;

	@Override
	public Map<String, Object> createNewUser(User user) {
		return userFeignClient.createNewUser(user);
	}

	@Override
	public User findByUsername(String username) {
		return userFeignClient.findByUsername(username);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		addUserAuthoritiesAndDetalis(username);
		return userDetails;
	}

	public void addUserAuthoritiesAndDetalis(String username) {
		user = userFeignClient.findByUsername(username);
		authorities.add(new SimpleGrantedAuthority(user.getRole().getRole()));
		userDetails = new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
				Boolean.valueOf(user.getActive()), true, true, true, authorities);
	}

}
