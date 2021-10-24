package tn.esprit.spring.services.Employes;



import tn.esprit.spring.entities.Employe;

import java.util.List;

public interface IEmployeService {
    List<Employe> retrieveAllEmployes();
    Employe addEmploye(Employe e);
    void deleteEmploye(String id);
    Employe updateEmploye(Employe e);
    Employe retrieveEmploye(String id);
}
