package com.bank.repository;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.bank.model.Account;

@Repository
public class JdbcAccountRepository implements AccountRepository {

	private static Logger logger = Logger.getLogger("bank");

	@Autowired
	private DataSource dataSource;

	public Account loadAccount(String num) {
		logger.info("loading account " + num);
		return null;
	}

	
	public void updateAccount(Account account) {
		logger.info("updating account ");
		// .
	}

}
