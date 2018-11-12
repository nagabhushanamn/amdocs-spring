package com.bank.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = { "com.bank.service,com.bank.repository" })
@Import(value = { DbConfig.class })
public class BankConfig {

//	@Autowired
//	private DataSource dataSource;
//
//	@Bean()
//	public TxrService txrService() {
//		TxrServiceImpl txrService = new TxrServiceImpl();
//		txrService.setAccountRepository(jdbcAccRepo());
//		return txrService;
//	}
//
//	@Bean()
//	public AccountRepository jdbcAccRepo() {
//		AccountRepository accountRepository = new JdbcAccountRepository(dataSource);
//		return accountRepository;
//	}

}
