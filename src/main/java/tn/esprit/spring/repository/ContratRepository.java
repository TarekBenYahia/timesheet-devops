package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.spring.entities.Contrat;

public interface ContratRepository extends CrudRepository<Contrat,Integer> {
}
