package com.bank.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = { DbConfig.class })
@ComponentScan(basePackages = { "com.bank.service", "com.bank.repository" })
public class BankConfig {

}
