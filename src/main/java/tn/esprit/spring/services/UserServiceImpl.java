package tn.esprit.spring.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.repository.UserRepository;
import tn.esprit.spring.entities.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



@Service
public class UserServiceImpl implements IUserService {


	@Autowired
	UserRepository userRepository;
	private static final Logger l = LogManager.getLogger(UserServiceImpl.class);

	// TODO Logger à ajouter

	@Override
	public List<User> retrieveAllUsers() {
		List<User> users = null;
		try {
			l.info("In Method retrieve all Users : ");

			users = (List<User>) userRepository.findAll();
			l.debug("connexion à la db ok!");
			for (User user : users) {
				// TODO Log à ajouter pour affiher chaque user dans les logs
				l.info("Utilisateur");
			}
			l.info("Out of Method retrieve all users with success");
		}catch (Exception e) {
			l.error("erreuur");
		}


		return users;
	}


	@Override
	public User addUser(User u) {

		l.info("In method Add User");
	//	userRepository.insertUser(u.getDateNaissance(),u.getLastName(),u.getLastName(),u.getRole());

		User u_saved = userRepository.save(u);
		l.info("Utilisateur Ajoute");
		return u_saved;
	}

	@Override
	public User updateUser(User u) {
		l.info("update en cours");
		User u_saved = userRepository.save(u);
		l.info("update done!!");
		return u_saved;
	}

	@Override
	public void deleteUser(String id) {
		l.info("Deleting...");
		userRepository.deleteById(Long.parseLong(id));
		l.info("User {} deleted succesfully!",id);
	}


	@Override
	public User retrieveUser(String id) {
		l.info("Recherche user en cours...");
		//User u =  userRepository.findById(Long.parseLong(id)).orElse(null);
		User u =  userRepository.findById(Long.parseLong(id)).orElse(null);
		l.info("user {} retrieved",u);
		return u;
	}
}
