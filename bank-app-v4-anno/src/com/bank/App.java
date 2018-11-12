package com.bank;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bank.repository.AccountRepository;
import com.bank.repository.JdbcAccountRepository;
import com.bank.repository.JpaAccountRepository;
import com.bank.service.TxrService;
import com.bank.service.TxrServiceImpl;

public class App {

	public static void main(String[] args) {

		// --------------------------------
		// phase-1: Init
		// ---------------------------------
		System.out.println("----------------------------------");
		ConfigurableApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("bank-app.xml", "infra.xml");
		System.out.println("----------------------------------");
		// --------------------------------
		// phase-2: Use
		// ---------------------------------
		System.out.println("----------------------------------");

		TxrService txrService = context.getBean("txrService", TxrService.class);

		System.out.println();
		txrService.txr(100.00, "1", "2");
		System.out.println();
		txrService.txr(100.00, "2", "1");
		System.out.println();

		System.out.println("----------------------------------");
		// --------------------------------
		// phase-3: destroy
		// ---------------------------------
		context.close();

	}

}
