package xyz.sherin.springmvcreact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@SpringBootApplication
@EnableJdbcRepositories
public class SpringMvcReactApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringMvcReactApplication.class, args);
  }

}
