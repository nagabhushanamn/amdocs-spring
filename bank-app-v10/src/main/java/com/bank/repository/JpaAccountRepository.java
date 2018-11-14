package com.bank.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.bank.model.Account;

@Repository
public class JpaAccountRepository implements AccountRepository {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Account loadAccount(String num) {
		return em.find(Account.class, num); // select * from TABLE where num=?Ï
	}

	@Override
	public Account updateAccount(Account account) {
		return em.merge(account);
	}
	///..

}
