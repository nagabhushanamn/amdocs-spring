package com.bank.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

import com.bank.service.TxrServiceImpl;

@Configuration
@Import(value = { DbConfig.class })
@ComponentScan(basePackages = { "com.bank.service", "com.bank.repository","com.bank.aspects" })
@EnableAspectJAutoProxy
public class BankConfig {

}
