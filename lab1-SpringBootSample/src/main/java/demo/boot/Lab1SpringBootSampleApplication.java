package demo.boot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication// (scanBasePackages = "com.boot")   @Configuration, @ComponentScan, @EnableAutoConfiguration(@EnableWebMvc)
public class Lab1SpringBootSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab1SpringBootSampleApplication.class, args);
	}


}
