package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.websocket.servlet.WebSocketMessagingAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.example.amdocs.config.AmdocsAutoConfig;

//@SpringBootApplication
@Configuration
@ComponentScan(basePackages = { "com.example.demo" })
@EnableAutoConfiguration
public class BootAppV1Application {

	public static void main(String[] args) {
		SpringApplication.run(BootAppV1Application.class, args);
	}

	@Bean
	public CommandLineRunner clr(AmdocsAutoConfig config) {
		return args -> {
			System.out.println(config.getLocation());
		};
	}

}
