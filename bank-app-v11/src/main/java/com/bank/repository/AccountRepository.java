package com.bank.repository;

import com.bank.model.Account;

public interface AccountRepository {

	Account loadAccount(String num);
	Account updateAccount(Account account);
}
