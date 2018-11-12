package com.bank.service;

import org.apache.log4j.Logger;

import com.bank.model.Account;
import com.bank.repository.AccountRepository;

/*
 *  design & performance issues
 *  ----------------------------
 *  
 *  => tight-coupling b/w dependent & dependency
 *  	-> can't extend component with new features easily
 *  => too many duplicate dependency instances created & discarded
 *  	-> slow, memory/resource use is high
 *  => Unit-Testing not possible
 *  	-> dev/bug fix slow
 *  
 *  
 *  why these issues ?
 *  
 *  => dependent obj itself creating its own dependency
 *  
 *  soln:
 *  
 *  => don't create, get from factory
 *  
 *  limitation on factory-lookup:
 *  
 *  ==> factory-location tight-coupling
 *  
 *  best-soln:
 *  
 *  => don't create / don't lookup , get thru third-party  ( IOC )
 *  
 *  how to implement this IOC ?
 *  
 *    => dependency injection ( DI )
 *    => AOP
 *  
 *  
 * 
 */

public class TxrServiceImpl implements TxrService {

	private static Logger logger = Logger.getLogger("bank");

	private AccountRepository accountRepository;

	public TxrServiceImpl(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
		logger.info("TxrService instance created..");
	}

	/* (non-Javadoc)
	 * @see com.bank.service.TxrService#txr(double, java.lang.String, java.lang.String)
	 */
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
