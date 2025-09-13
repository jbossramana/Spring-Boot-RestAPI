package demo.boot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import demo.boot.service.GenericMessage;
import demo.boot.service.WelcomeMessage;

@Configuration
public class AppConf {

    @Bean
    @ConditionalOnProperty(name="welcomebean.enabled", havingValue="false")
    public WelcomeMessage welcomeBean() {

        return new WelcomeMessage("Welcome!");
    }

    @Bean
    @ConditionalOnMissingBean(WelcomeMessage.class)
    public GenericMessage messageBean() {

        return new GenericMessage("Today is a beautiful day.");
    }
}
