package main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import service.EmployeService;


@Controller
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        EmployeService employeService= context.getBean("employeService" , EmployeService.class);
        System.out.println(employeService.getAllEmploye());


    }
}
