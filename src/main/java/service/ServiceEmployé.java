package service;

import entities.Département;
import entities.Employé;

public class ServiceEmployé {

    private Employé employé;
    private Département département;

    public ServiceEmployé(Employé employé, Département département) {
        this.employé = employé;
        this.département = département;
    }

}
