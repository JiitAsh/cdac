package fi.springJdbcDao.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import fi.springJdbcDao.dao.UsersDAO;
import fi.springJdbcDao.dao.UsersDAOImplementation;

@Component
@PropertySource("classpath:application.properties")
@PropertySource("classpath:app.properties")
public class ApplicationConfiguration {
	@Autowired
	Environment env;

	@Bean
	public DataSource dataSource() {
		String driver = env.getProperty("db.connection.driverclass");
		String url = env.getProperty("db.connection.url");
		String dbUser = env.getProperty("db.connection.username");
		String dbPwd = env.getProperty("db.connection.password");
		

		DriverManagerDataSource ds = new DriverManagerDataSource();

		ds.setDriverClassName(driver);
		ds.setUrl(url);
		ds.setUsername(dbUser);
		ds.setPassword(dbPwd);

		return ds;
	}

	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {

		return new JdbcTemplate(dataSource);
	}

	@Bean
	@Scope(scopeName="prototype")
	public UsersDAO userDAO() {
		return new UsersDAOImplementation();
	}
}
