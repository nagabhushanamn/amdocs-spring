
create schema my_bank;

create table my_bank.ACCOUNTS(
	num varchar(12) primary key,
	balance double,
	type vrachr(20)
);

create table my_bank.TXNS(
	id int primary key,
	amount double,
	txn_date date,
	type varchar(20),
	acc_num varchar(12) references my_bank.ACCOUNTS.num
)