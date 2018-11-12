package com.bank.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bank.model.Account;
import com.bank.repository.AccountRepository;

@Service("txrService")
public class TxrServiceImpl implements TxrService {

	private static Logger logger = Logger.getLogger("bank");

	@Autowired
	private AccountRepository accountRepository;

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
