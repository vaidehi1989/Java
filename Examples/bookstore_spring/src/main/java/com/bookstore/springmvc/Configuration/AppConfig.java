package com.bookstore.springmvc.Configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableTransactionManagement
@EnableWebMvc
@ComponentScan({ "com.bookstore.demos.profiles_jdbctemplating" })
@PropertySource(value = { "classpath:database.properties" })
public class AppConfig {

	@Autowired
	private Environment environment;

	// @Bean
	// public LocalSessionFactoryBean sessionFactory() {
	// LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
	// sessionFactory.setDataSource(dataSource());
	// sessionFactory.setPackagesToScan(new String[] { "com.springmcv.model" });
	// sessionFactory.setHibernateProperties(hibernateProperties());
	// return sessionFactory;
	// }
	//
	// @Bean
	// public DataSource dataSource() {
	// DriverManagerDataSource dataSource = new DriverManagerDataSource();
	// dataSource.setDriverClassName(environment.getRequiredProperty("jdbc.driverClassName"));
	// dataSource.setUrl(environment.getRequiredProperty("jdbc.url"));
	// dataSource.setUsername(environment.getRequiredProperty("jdbc.username"));
	// dataSource.setPassword(environment.getRequiredProperty("jdbc.password"));
	// return dataSource;
	// }
	//
	// private Properties hibernateProperties() {
	// Properties properties = new Properties();
	// properties.put("hibernate.dialect",
	// environment.getRequiredProperty("hibernate.dialect"));
	// properties.put("hibernate.show_sql",
	// environment.getRequiredProperty("hibernate.show_sql"));
	// properties.put("hibernate.format_sql",
	// environment.getRequiredProperty("hibernate.format_sql"));
	// properties.put("hibernate.hbm2ddl.auto",
	// environment.getRequiredProperty("hibernate.hbm2ddl.auto"));
	// return properties;
	// }
	//
	// @Bean
	// @Autowired
	// public HibernateTransactionManager transactionManager(SessionFactory s) {
	// HibernateTransactionManager txManager = new
	// HibernateTransactionManager();
	// txManager.setSessionFactory(s);
	// return txManager;
	// }

	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");

		return viewResolver;
	}

	@Bean
	public DataSource createDataSource() {
		System.out.println("Creating Prod database - 1");

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
		System.out.println("Creating jdbctemplate database - 1");
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		return jdbcTemplate;
	}
}
