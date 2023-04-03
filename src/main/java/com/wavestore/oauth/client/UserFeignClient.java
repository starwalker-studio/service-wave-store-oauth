package com.wavestore.oauth.client;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.wavestore.service.users.commons.models.entity.User;

@FeignClient(name = "service-wavestore-users")
public interface UserFeignClient {

	@PostMapping("/new-user")
	public Map<String, Object> createNewUser(@RequestBody User user);
	
	@GetMapping("/users/search/search-username")
	public User findByUsername(@RequestParam("user") String username);
	
}
