package service;

import entities.Département;
import entities.Employé;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.EmpRepository;

import java.util.List;

@Service
public class EmployeServiceImpl implements EmployeService {

    @Autowired
    private EmpRepository empRepository;

    public EmployeServiceImpl() {
    }


    @Override
    public List<Employé> getAllEmploye() {
        return empRepository.findAll();
    }

    @Override
    public void updateEmploye(Employé employé) {
      empRepository.save(employé);
    }

    @Override
    public Employé save(Employé employé) {
        return empRepository.save(employé);
    }
}
