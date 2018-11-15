package com.example.amdocs.config;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ConditionalOnClass(name= {"com.example.amdocs.Amdocs"})
//@ConditionalOnMissingClass(value= {"com.example.demo.amdocs.Amdocs"})
//@ConditionalOnMissingBean(name="dataSource")
@ConditionalOnProperty(name = "config", prefix = "amdocs")
@ConfigurationProperties(prefix = "amdocs")
public class AmdocsAutoConfig {

	@NotBlank(message="Location cannot be blank")
	private String location;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
