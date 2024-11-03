package ctx2;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ctx2")
@EnableAutoConfiguration
@PropertySource("classpath:ctx2.properties")
public class Ctx2Config {

}