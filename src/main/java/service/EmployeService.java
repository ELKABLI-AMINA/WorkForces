package service;

import entities.Employé;

import java.util.List;

public interface EmployeService {
    public List<Employé> getAllEmploye();
    public void updateEmploye(Employé employé);
    public void addNewEmployee(Employé employé);
}
