package demo;

import demo.dao.EmployeeDao;
import demo.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            EmployeeDao dao = context.getBean(EmployeeDao.class);

            dao.save(new Employee("Alice", "HR"));
            dao.save(new Employee("Bob", "IT"));

            List<Employee> employees = dao.findAll();
            employees.forEach(System.out::println);
        }
    }
}
