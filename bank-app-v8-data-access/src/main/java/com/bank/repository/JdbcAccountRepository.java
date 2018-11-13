package com.bank.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

//import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.bank.model.Account;

@Repository
@Qualifier("jdbc")
public class JdbcAccountRepository implements AccountRepository {

//	private static Logger logger = Logger.getLogger("bank");

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public JdbcAccountRepository(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public Account loadAccount(String num) {
//		logger.info("loading account " + num);
		String sql = "select * from my_bank.ACCOUNTS where num=?";
		Account account = jdbcTemplate.queryForObject(sql, new RowMapper<Account>() {
			@Override
			public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
				Account account = new Account();
				account.setNum(rs.getString(1));
				account.setBalance(rs.getDouble(2));
				return account;
			}
		}, num);
		return account;
	}

	public void updateAccount(Account account) {
//		logger.info("updating account ");
		String sql = "update my_bank.ACCOUNTS set balance=? where num=?";
		jdbcTemplate.update(sql, account.getBalance(), account.getNum());
	}

}
