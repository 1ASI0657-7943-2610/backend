package backend.finteka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class FintekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(FintekaApplication.class, args);
    }

}
