package com.wavestore.oauth.service;

import java.util.Map;

import com.wavestore.service.users.commons.models.entity.User;

public interface IUserService {

	public Map<String, Object> createNewUser(User user);

	public User findByUsername(String username);

}
