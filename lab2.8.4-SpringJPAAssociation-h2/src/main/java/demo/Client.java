package demo;

import demo.dao.DepartmentDao;
import demo.entity.Department;
import demo.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(AppConfig.class)) {

            DepartmentDao dao = context.getBean(DepartmentDao.class);

            var dept = new Department("IT");

            dept.addEmployee(new Employee("Alice"));
            dept.addEmployee(new Employee("Bob"));

            dao.save(dept);

            Department fetched = dao.find(dept.getId());
           
            System.out.println("Department: " + fetched);
            for (Employee emp : fetched.getEmployees()) {
                System.out.println(" - " + emp);
            }
            
        }
    }
}
