package com.bank.repository;

import org.apache.log4j.Logger;

import com.bank.model.Account;

public class JdbcAccountRepository implements AccountRepository {

	private static Logger logger = Logger.getLogger("bank");

	public JdbcAccountRepository() {
		logger.info("JdbcAccountRepository instance created");
	}

	/* (non-Javadoc)
	 * @see com.bank.repository.AccountRepository#loadAccount(java.lang.String)
	 */
	public Account loadAccount(String num) {
		logger.info("loading account " + num);
		// ..
		return null;
	}

	/* (non-Javadoc)
	 * @see com.bank.repository.AccountRepository#updateAccount(com.bank.model.Account)
	 */
	public void updateAccount(Account account) {
		logger.info("updating account ");
		// .
	}

}
