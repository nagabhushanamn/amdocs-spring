package com.bank.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.bank.model.Account;

@Repository
@Qualifier("jpa")
public class JpaAccountRepository implements AccountRepository {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public Account loadAccount(String num) {
		return em.find(Account.class, num);
	}

	@Override
	public void updateAccount(Account account) {
		 em.merge(account);
	}

}
