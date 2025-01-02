package cdac.springrestrepo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class SpringrestrepoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringrestrepoApplication.class, args);
	}

}


//(scanBasePackages= {"cdac.springrestrepo.controllers", "cdac.springrestrepo.services"})
//@EntityScan(basePackages= {"cdac.springrestrepo.entity"})
//@EnableJpaRepositories(basePackages= {"cdac.springrestrepo.repositores"})