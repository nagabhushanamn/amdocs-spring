package com.bank.repository;

import com.bank.model.Txn;

public interface TxnRepository {

	void save(Txn txn);
	
}
