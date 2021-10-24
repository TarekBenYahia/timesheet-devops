package tn.esprit.spring.services.Entreprise;


import tn.esprit.spring.entities.Entreprise;

import java.util.List;

public interface IEntrepriseService {

    List<Entreprise> retrieveAllEntreprises();
    Entreprise addEntreprise(Entreprise e);
    void deleteEntreprise(String id);
    Entreprise updateEntreprise(Entreprise e);
    Entreprise retrieveEntreprise(String id);

}
