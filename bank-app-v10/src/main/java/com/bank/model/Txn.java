package com.bank.model;

import java.time.LocalDateTime;

public class Txn {

	private int id;
	private double amount;
	private LocalDateTime localDateTime;
	private TxnType type;

	private Account account;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}

	public TxnType getType() {
		return type;
	}

	public void setType(TxnType type) {
		this.type = type;
	}
	
	

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Txn [id=" + id + ", amount=" + amount + ", localDateTime=" + localDateTime + ", type=" + type + "]";
	}

}
