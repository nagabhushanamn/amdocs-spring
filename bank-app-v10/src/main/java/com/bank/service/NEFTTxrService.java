package com.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bank.model.Account;
import com.bank.repository.AccountRepository;

@Service
public class NEFTTxrService implements TxrService {

	@Autowired
	private AccountRepository accountRepository;

	@Override
	@Transactional
	public boolean txr(double amount, String fromAccNum, String toAccNum) {

		Account fromAccount = accountRepository.loadAccount(fromAccNum);
		Account toAccount = accountRepository.loadAccount(toAccNum);

		// debit & credit
		fromAccount.setBalance(fromAccount.getBalance() - amount);
		toAccount.setBalance(toAccount.getBalance() + amount);

		accountRepository.updateAccount(fromAccount);
		accountRepository.updateAccount(toAccount);

		return true;
	}

}
