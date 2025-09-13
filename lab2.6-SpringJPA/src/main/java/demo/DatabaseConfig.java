package demo;

import java.util.Properties;

import javax.naming.NamingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import jakarta.persistence.EntityManagerFactory;

@Configuration
@ComponentScan(basePackages={"demo.dao", "demo.service"})
@EnableTransactionManagement
public class DatabaseConfig {
 
 @Bean
 public DriverManagerDataSource getDataSource() {
       DriverManagerDataSource dataSource = new DriverManagerDataSource();
         // dataSource.setDriverClassName("com.mysql.jdbc.Driver");
          dataSource.setUrl("jdbc:mysql://localhost:3306/demo");
          dataSource.setUsername("root");
          dataSource.setPassword("root");
      return dataSource;
 }
 
 @Bean
 //@Autowired
 public PlatformTransactionManager getTransactionManager(EntityManagerFactory emf) throws NamingException{
      JpaTransactionManager jpaTransaction = new JpaTransactionManager();
      jpaTransaction.setEntityManagerFactory(emf);
      return jpaTransaction;
 }
 
@Bean
 public LocalContainerEntityManagerFactoryBean getEMF() {
 
     LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
     emf.setDataSource(getDataSource());
     emf.setPersistenceUnitName("spring-jpa-unit");
     emf.setJpaVendorAdapter(getHibernateAdapter());
         Properties jpaProperties = new Properties();
        jpaProperties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        jpaProperties.put("hibernate.hbm2ddl.auto", "create-drop");
        jpaProperties.put("hibernate.show_sql", "true");
        jpaProperties.put("hibernate.format_sql","false");
      emf.setJpaProperties(jpaProperties);
   return emf;
 }
  @Bean
  public JpaVendorAdapter getHibernateAdapter() {
      return new HibernateJpaVendorAdapter();
  }
 
}