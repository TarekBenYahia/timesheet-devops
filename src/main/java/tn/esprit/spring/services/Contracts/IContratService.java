package tn.esprit.spring.services.Contracts;
import tn.esprit.spring.entities.Contrat;
import java.util.List;

public interface IContratService {

   List<Contrat> retrieveAllContrats();
	Contrat addContract(Contrat c);
	void deleteContrat(String id);
    Contrat updateContrat(Contrat c);
    Contrat retrieveContrat(String id);
}
