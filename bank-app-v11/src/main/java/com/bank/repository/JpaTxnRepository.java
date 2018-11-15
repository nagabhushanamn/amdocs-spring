package com.bank.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.bank.model.Txn;

@Repository
public class JpaTxnRepository implements TxnRepository {

	@PersistenceContext
	private EntityManager em;

	@Override
	public void save(Txn txn) {
		em.persist(txn); // insert ...
	}
}
