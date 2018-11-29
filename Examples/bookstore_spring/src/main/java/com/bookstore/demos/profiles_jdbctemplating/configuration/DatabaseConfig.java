package com.bookstore.demos.profiles_jdbctemplating.configuration;

import javax.sql.DataSource;

public interface DatabaseConfig {

	DataSource createDataSource();
	
}
