package com.bank;

import com.bank.service.TxrServiceImpl;

public class App {

	public static void main(String[] args) {

		// --------------------------------
		// phase-1: Init
		// ---------------------------------

		TxrServiceImpl txrService = new TxrServiceImpl();

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
