package service;

import entities.Département;

public interface DepService {
    public void ajouterDepartement(Département departement) ;
    Département getDepartementById(Long id);
}
