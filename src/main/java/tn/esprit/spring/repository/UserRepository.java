package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.spring.entities.User;



@Repository
@Transactional
public interface UserRepository extends  CrudRepository<User, Long> {

}
