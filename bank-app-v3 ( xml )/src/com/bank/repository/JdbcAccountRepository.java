package com.bank.repository;


import javax.sql.DataSource;

import org.apache.log4j.Logger;

import com.bank.model.Account;

public class JdbcAccountRepository implements AccountRepository {

	private static Logger logger = Logger.getLogger("bank");

	private DataSource dataSource;

	public JdbcAccountRepository(DataSource dataSource) {
		this.dataSource = dataSource;
		logger.info("JdbcAccountRepository instance created");
	}

	public Account loadAccount(String num) {
		logger.info("loading account " + num);
		return null;
	}

	public void updateAccount(Account account) {
		logger.info("updating account ");
		// .
	}

}
