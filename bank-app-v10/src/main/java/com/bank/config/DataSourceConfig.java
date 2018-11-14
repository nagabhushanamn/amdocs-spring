package com.bank.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:datasource.properties")
public class DataSourceConfig {

	@Autowired
	private Environment env;

	@Bean
	public DataSource dataSource() {
		BasicDataSource basicDataSource = new BasicDataSource();
		basicDataSource.setDriverClassName(env.getProperty("db.driver"));
		basicDataSource.setUrl(env.getProperty("db.url"));
		basicDataSource.setUsername(env.getProperty("db.user"));
		basicDataSource.setPassword(env.getProperty("db.password"));
		return basicDataSource;
	}

}
