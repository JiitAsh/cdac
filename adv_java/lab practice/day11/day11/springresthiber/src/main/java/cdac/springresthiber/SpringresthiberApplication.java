package cdac.springresthiber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages= {"cdac.springresthiber.controllers", "cdac.springresthiber.services"})
@EntityScan(basePackages= {"cdac.springresthiber.entity"})
public class SpringresthiberApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringresthiberApplication.class, args);
	}

}
