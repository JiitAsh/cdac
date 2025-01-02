package cdac.microcategory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages= {"cdac.microcategory.controllers","cdac.microcategory.services"})
@EntityScan(basePackages= {"cdac.microcategory.entity"})
@EnableJpaRepositories(basePackages= {"cdac.microcategory.repositories"})
public class MicrocategoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicrocategoryApplication.class, args);
	}

}
