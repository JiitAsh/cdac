package cdac.springmvn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages= {"cdac.springmvn.controllers"})
@EntityScan(basePackages= {"cdac.springmvn.entity"})
public class SpringmvnApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringmvnApplication.class, args);
	}

}
