package demo.config;

import org.springframework.context.annotation.*;



@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "demo")
public class AppConfig {


}

