package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author  sivaK
 */
@SpringBootApplication
@RestController
@EnableConfigurationProperties(value = MyConfig.class)
@RequestMapping("/api")
public class ServiceDiscoveryConsulApplication {

	@Autowired
	private MyConfig myConfig;

	@GetMapping("/getAll")
	public MyConfig getUserDetails() {
		System.out.println("userName:" + myConfig.getUsername());
		System.out.println("password:" + myConfig.getPassword());
		return myConfig;
	}

	public static void main(String[] args) {
		SpringApplication.run(ServiceDiscoveryConsulApplication.class, args);
	}
}

