package tn.esprit.spring.services.Departements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.repository.DepartementRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;

@Service
public class DepartementServiceImpl implements IDepartementService{

    @Autowired
    DepartementRepository departementRepository;
    private static final  Logger logger= LogManager.getLogger(DepartementServiceImpl.class);


    @Override
    public List<Departement> retrieveAllDepartements() {
        List<Departement> departements = null;
        try {
            logger.info("In method Retrrieve Departements!");
            departements = (List<Departement>) departementRepository.findAll();
            logger.info("Connexion a la base de donnée effectuée! ");
            for (Departement dep : departements){
                logger.info("Departement {}",dep);
            }
            logger.info("Out of method Retrieve departements");

        } catch (Exception e) {
            logger.error("Error retrieving Departments");
        }
        return departements;
    }




    @Override
    public Departement addDepartement(Departement e) {
        logger.info("Into Method Add Department! ");
        Departement dSaved = departementRepository.save(e);
        logger.info("Department added! ");
        return dSaved;
    }





    @Override
    public void deleteDepartement(String id) {
        logger.info("Deleting Department ...");
        departementRepository.deleteById((int) Long.parseLong(id));
        logger.info("Department; {} deleted",id);
    }

    @Override
    public Departement updateDepartement(Departement e) {
        logger.info("Into Method Update Department! ");
        Departement dSaved = departementRepository.save(e);
        logger.info("Department Updated! ");
        return dSaved;
    }

    @Override
    public Departement retrieveDepartement(String id) {
        logger.info("Searching department ...");
        Departement d = departementRepository.findById((int) Long.parseLong(id)).orElse(null);
        logger.info("Department {} found",d);
        return  d;
    }
}
