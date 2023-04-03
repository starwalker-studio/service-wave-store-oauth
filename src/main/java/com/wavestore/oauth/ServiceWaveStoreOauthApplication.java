package com.wavestore.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.hateoas.config.EnableHypermediaSupport;

@EnableFeignClients
@EnableEurekaClient
@EnableHypermediaSupport(type = EnableHypermediaSupport.HypermediaType.HAL)
@SpringBootApplication(scanBasePackages = {
		"com.wavestore.oauth.service",
		"com.wavestore.oauth.controller",
		"com.wavestore.oauth.security",
		})
public class ServiceWaveStoreOauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceWaveStoreOauthApplication.class, args);
	}

}
