package com.bank.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bank.model.Account;
import com.bank.model.Txn;
import com.bank.model.TxnType;
import com.bank.repository.AccountRepository;
import com.bank.repository.TxnRepository;

@Service
public class NEFTTxrService implements TxrService {

	@Autowired
	private AccountRepository accountRepository;
	@Autowired
	private TxnRepository txnRepository;

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

		Txn debitTxn = new Txn();
		debitTxn.setAmount(amount);
		debitTxn.setDate(new Date());
		debitTxn.setType(TxnType.DEBIT);
		debitTxn.setAccount(fromAccount);

		Txn creditTxn = new Txn();
		creditTxn.setDate(new Date());
		creditTxn.setType(TxnType.CREDIT);
		creditTxn.setAmount(amount);
		creditTxn.setAccount(toAccount);

		txnRepository.save(debitTxn);
		txnRepository.save(creditTxn);

		return true;
	}

}
