package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.spring.entities.User;



@Repository
@Transactional
public interface UserRepository extends  CrudRepository<User, Long> {
 /*   @Modifying
	@Query(value = "insert into t_user (date_naissance, first_name,last_name, role) values (:dn, :fn,:ln, :role)", nativeQuery = true)
	void insertUser(@Param("dn") Date dn, @Param("fn") String fn, @Param("ln") String ln, @Param("role") Role role);
*/
}







// List<User> findByFirstName(String fname);
// List<User> findByLastName(String lname);
// List<User> findByIdGreaterThan(int lname);

//	@Query("SELECT MAX((e.id), 0) FROM User e")
//	Long getMaxId();

//	// JPQL Update :
//	@Modifying
//	@Query("update User u set u.role = :role where u.firstName = :fname")
//	int updateUserStatusForFirstName(@Param("role") Integer status, @Param("fname") String fname);

	// Native Update :
//	@Modifying
//	@Query(value = "update User u set u.status = ? where u.name = ?", nativeQuery = true)
//	int updateUserStatusForFirstName1(Integer status, String name);

//	@Modifying
//	@Query(value = "insert into Users (firstName, lastName, role) values (:fn, :ln, :role)", nativeQuery = true)
//	void insertUser(@Param("fn") String fn, @Param("ln") Integer ln, @Param("role") Integer role);
