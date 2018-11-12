package com.bank.service;

import org.apache.log4j.Logger;

import com.bank.model.Account;
import com.bank.repository.AccountRepository;

public class TxrServiceImpl implements TxrService {

	private static Logger logger = Logger.getLogger("bank");

	private String txrType;
	private AccountRepository accountRepository;

	public TxrServiceImpl(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
		logger.info("TxrService instance created..");
	}

	public void setTxrType(String txrType) {
		this.txrType = txrType;
	}

	public String getTxrType() {
		return txrType;
	}

	public void init() {
		logger.info("TxrService :: init()");
	}

	public void destroy() {
		logger.info("TxrService :: destroy()");
	}

	public boolean txr(double amount, String fromAccNum, String toAccNum) {
		logger.info("Txr initiated..");

		Account fromAccount = accountRepository.loadAccount(fromAccNum);
		Account toAccount = accountRepository.loadAccount(toAccNum);

		// debit & credit

		accountRepository.updateAccount(fromAccount);
		accountRepository.updateAccount(toAccount);
		logger.info("Txr finished..");
		return true;
	}

}
