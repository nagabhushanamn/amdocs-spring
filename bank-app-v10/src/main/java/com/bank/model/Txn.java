package com.bank.model;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TXNS", schema = "my_bank")
public class Txn {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private double amount;
	@Column(name = "txn_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;
	@Enumerated(EnumType.STRING)
	private TxnType type;

	@ManyToOne
	@JoinColumn(name = "acc_num")
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
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
		return "Txn [id=" + id + ", amount=" + amount + ", date=" + date + ", type=" + type + "]";
	}

}
