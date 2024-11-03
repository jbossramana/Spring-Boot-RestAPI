package demo.client;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // scans for beans annotated with @Bean
@ComponentScan("demo") // scam for steriotype annotations
public class AppConfiguration {

}
