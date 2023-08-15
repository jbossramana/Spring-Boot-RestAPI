package demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollectionConfig {

    @Bean
    public CollectionsBean getCollectionsBean() {
        return new CollectionsBean();
    }

    @Bean("list1")
    public List<String> nameList() {
        return Arrays.asList("spring", "hibernate", "kafka");
    }
    
    
    @Bean("list2")
    public List<String> nameList2() {
        return Arrays.asList("jpa", "mybatis", "confluent");
    }
    
    @Bean
    public Account getAccount()
    {
    	return new Account();
    }
}