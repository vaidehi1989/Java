package com.bookstore.demos.profiles_jdbctemplating.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Profile("Development")
//@Configuration
public class DevDatabaseConfig implements DatabaseConfig {

	@Autowired
	Environment environment;

	@Bean(name = "ds")
	public DataSource createDataSource() {
		System.out.println("Creating Development database");

		DriverManagerDataSource dataSource = new DriverManagerDataSource();

		dataSource.setDriverClassName(environment.getProperty("driver"));
		dataSource.setUrl(environment.getProperty("url"));
		dataSource.setUsername(environment.getProperty("dbuser"));
		dataSource.setPassword(environment.getProperty("dbpassword"));

		return dataSource;
	}

	@Autowired
	@Bean(name = "jdbcTemplate")
	public JdbcTemplate createJdbcTemplate(DataSource dataSource) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		return jdbcTemplate;
	}

}
