package com.wavestore.oauth.security;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import com.wavestore.oauth.service.IUserService;
import com.wavestore.service.users.commons.models.entity.User;

@Component
public class InfoAddicionalToken implements TokenEnhancer{
	
	@Autowired
	private IUserService userService;

	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
		Map<String, Object> info = new HashMap<String, Object>();
		User user = userService.findByUsername(authentication.getName());
		info.put("nombre", user.getUserFirstName());
		info.put("apellido", user.getUserLastName());
		info.put("correo", user.getUserMail());
		((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(info);
		return accessToken;
	}	
	
}
