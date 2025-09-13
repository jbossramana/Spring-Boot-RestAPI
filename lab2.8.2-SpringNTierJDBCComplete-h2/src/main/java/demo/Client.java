package demo;

import demo.dao.EmployeeDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            var dao = context.getBean(EmployeeDao.class);

            dao.insertMessage("Hire", "Congrats! You are hired");
            dao.insertMessage("Fire", "Sorry! You are fired");

            System.out.println("Hire -> " + dao.getMessage("Hire"));
            System.out.println("Fire -> " + dao.getMessage("Fire"));
        }
    }
}
