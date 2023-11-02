package main;


import entities.Département;
import entities.Employé;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import service.DepService;
import service.EmployeService;

import java.util.List;


@Controller
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        DepService depService= context.getBean("DepService" , DepService.class);
        EmployeService employeService = context.getBean("employeService", EmployeService.class);

        // add département
      //  Département dep1= new Département("RH");

      //  depService.ajouterDepartement(dep1);

        // Créer un employé
      //  Employé employe = new Employé("amina", 12345, dep1);
       // employeService.save(employe);

        //récupérer tous les employés
        List<Employé> allEmployees =employeService.getAllEmploye();
        for (Employé emp : allEmployees) {
            System.out.println(emp);
        }




    }
}
