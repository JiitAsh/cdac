package cdac.jobportal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages= {"cdac.jobportal.controllers", "cdac.jobportal.services"})
@EntityScan(basePackages= {"cdac.jobportal.entity"})
@EnableJpaRepositories(basePackages= {"cdac.jobportal.repo"})
public class JobportalApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobportalApplication.class, args);
	}

}
