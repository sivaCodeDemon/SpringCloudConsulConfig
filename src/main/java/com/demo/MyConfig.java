package com.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@ConfigurationProperties(prefix = "my")
@Data
public class MyConfig {

	private String username;
	private String password;
}

