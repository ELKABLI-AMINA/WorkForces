package main;


import entities.Département;
import entities.Employé;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import service.DepService;
import service.EmployeService;

import java.util.List;
import java.util.stream.Collectors;


@Controller
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        DepService depService= context.getBean("DepService" , DepService.class);
        EmployeService employeService = context.getBean("employeService", EmployeService.class);

        // add département
     // Département dep1= new Département("RH");
       //Département dep2= new Département("Marketing");
      // Département dep3= new Département("finance");
      // Département dep4= new Département("vente");

          // depService.ajouterDepartement(dep2);
         //  depService.ajouterDepartement(dep3);
         //  depService.ajouterDepartement(dep4);


        // Créer un employé
       // Employé employe1 = new Employé("Faiza", 2000, dep2);
       // Employé employe2 = new Employé("Sofia", 20000, dep3);
       // Employé employe3 = new Employé("Simo", 15000, dep4);
        //  employeService.save(employe1);
        //  employeService.save(employe2);
        //  employeService.save(employe3);

        //récupérer tous les employés
        List<Employé> allEmployees =employeService.getAllEmploye();
        allEmployees.stream().forEach(System.out::println);

      //  }

        // Récupérer un employé spécifique par son ID
         /* Employé employeToUpdate = employeService.getEmployeById(1L);
           employeToUpdate.setName("Jodia");
           employeToUpdate.setSalaire(10000);
           employeService.updateEmploye(employeToUpdate);

       */
    }
}
