package ch.sunrise.backend;

import io.camunda.zeebe.spring.client.EnableZeebeClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableZeebeClient
public class CrmBackendApplication {
    public static void main(String[] args) {
        SpringApplication.run(CrmBackendApplication.class, args);
    }
}