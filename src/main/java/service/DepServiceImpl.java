package service;

import entities.Département;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.DepRepository;

@Service
public class DepServiceImpl implements DepService {
    @Autowired
    private DepRepository depRepository;

    @Override
    public void ajouterDepartement(Département departement) {
        depRepository.save(departement);
    }
    public Département getDepartementById(Long id) {
        return depRepository.findById(id).orElse(null);
    }
}
