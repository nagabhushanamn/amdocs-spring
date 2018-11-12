package com.bank;

import com.bank.repository.AccountRepository;
import com.bank.repository.JdbcAccountRepository;
import com.bank.repository.JpaAccountRepository;
import com.bank.service.TxrServiceImpl;

public class App {

	public static void main(String[] args) {

		// --------------------------------
		// phase-1: Init
		// ---------------------------------

		AccountRepository jdbcAccRepo = new JdbcAccountRepository();
		AccountRepository jpaAccRepo = new JpaAccountRepository();
		TxrServiceImpl txrService = new TxrServiceImpl(jdbcAccRepo);

		// --------------------------------
		// phase-2: Use
		// ---------------------------------

		System.out.println();
		txrService.txr(100.00, "1", "2");
		System.out.println();
		txrService.txr(100.00, "2", "1");
		System.out.println();

		// --------------------------------
		// phase-3: destroy
		// ---------------------------------
		// ..

	}

}
