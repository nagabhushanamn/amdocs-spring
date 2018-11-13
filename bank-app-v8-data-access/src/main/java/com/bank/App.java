package com.bank;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bank.config.BankConfig;
import com.bank.service.TxrService;

public class App {

	public static void main(String[] args) {

		// --------------------------------
		// phase-1: Init
		// ---------------------------------

		System.out.println("----------------------------------");
		ConfigurableApplicationContext context = null;
		context = new AnnotationConfigApplicationContext(BankConfig.class);
		System.out.println("----------------------------------");

		// --------------------------------
		// phase-2: Use
		// ---------------------------------
		System.out.println("----------------------------------");

		TxrService txrService = context.getBean("txrService", TxrService.class);

		System.out.println();
		txrService.txr(100.00, "1", "2");
		System.out.println();
		System.out.println("----------------------------------");

		// --------------------------------
		// phase-3: destroy
		// ---------------------------------

		context.close();

	}

}
