package cdac.microusers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages= {"cdac.microusers.controllers","cdac.microusers.services"})
@EntityScan(basePackages= {"cdac.microusers.entity"})
@EnableJpaRepositories(basePackages= {"cdac.microusers.repositories"})
public class MicrousersApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicrousersApplication.class, args);
	}

}
