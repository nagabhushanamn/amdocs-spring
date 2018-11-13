package com.bank.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.bank.service.TxrServiceImpl;

@Configuration
@Import(value = { DbConfig.class,JPAConfig.class })
@ComponentScan(basePackages = { "com.bank.service", "com.bank.repository" })
@EnableTransactionManagement
public class BankConfig {

}
