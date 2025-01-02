package springmvctwo.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import springmvctwo.dao.UsersDAO;
import springmvctwo.dao.UsersDAOImplementation;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "springmvctwo.controllers", "springmvctwo.beans" })
@PropertySource("classpath:app.properties")
public class springMVCConfiguration {
	@Autowired
	Environment env;

	@Bean
	public DataSource dataSource() {
		String url = env.getProperty("cn.url");
		String user = env.getProperty("cn.user");
		String pwd = env.getProperty("cn.pwd");
		String driver = env.getProperty("cn.drv");

		DriverManagerDataSource ds = new DriverManagerDataSource();

		ds.setUrl(url);
		ds.setUsername(user);
		ds.setPassword(pwd);
		ds.setDriverClassName(driver);

		return ds;
	}

	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}

	@Bean
	public UsersDAO userDAO() {
		return new UsersDAOImplementation();
	}

	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();

		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");

		return viewResolver;
	}
}
