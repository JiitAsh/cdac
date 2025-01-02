package cdac.springresthiber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages= {"cdac.springresthiber.controllers","cdac.springresthiber.services"})
@EntityScan(basePackages= {"cdac.springresthiber.entity"})
@EnableJpaRepositories(basePackages= {"cdac.springresthiber.repositories"})
public class SpringresthiberApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringresthiberApplication.class, args);
	}

}
