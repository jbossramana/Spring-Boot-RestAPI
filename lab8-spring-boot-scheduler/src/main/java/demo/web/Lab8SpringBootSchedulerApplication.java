package demo.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Lab8SpringBootSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab8SpringBootSchedulerApplication.class, args);
	}

}
