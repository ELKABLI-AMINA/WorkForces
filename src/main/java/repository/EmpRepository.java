package repository;

import entities.Employé;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepository  extends JpaRepository<Employé , Long> {
//  interface parceque spring data fournit les cruds
}

