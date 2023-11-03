package service;

import entities.Employé;

import java.util.List;

public interface EmployeService {
    public List<Employé> getAllEmploye();
    public void updateEmploye(Employé employé);

    public Employé save(Employé employé);

    Employé getEmployeById(long l);;
}
