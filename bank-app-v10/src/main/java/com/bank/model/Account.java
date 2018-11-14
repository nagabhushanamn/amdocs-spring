package com.bank.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ACCOUNTS",schema="my_bank")
public class Account {
	@Id
	private String num;
	private double balance;
	@Enumerated(EnumType.STRING)
	private AccountType type;
	
	//private List<Txn> txns;

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public AccountType getType() {
		return type;
	}

	public void setType(AccountType type) {
		this.type = type;
	}
	


//	public List<Txn> getTxns() {
//		return txns;
//	}
//
//	public void setTxns(List<Txn> txns) {
//		this.txns = txns;
//	}

	@Override
	public String toString() {
		return "Account [num=" + num + ", balance=" + balance + ", type=" + type + "]";
	}

}
