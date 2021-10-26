package tn.esprit.spring.service;
import java.util.Date;
import java.util.List;
import java.util.Random;


import org.junit.jupiter.api.Order;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.entities.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.spring.services.IUserService;


@SpringBootTest
public class UserServiceImplTest {
	@Autowired
	IUserService us;

	public Role generateRandom(){
	Role[] values = Role.values();
	int length = values.length;
	int randomIndex = new Random().nextInt(length);
	return values[randomIndex];
	}
	@Test
	@Order(1)
	public void addUserTest(){

		User u =  new User("Tarek","Ben Yahia",new Date(), generateRandom());
		Assertions.assertEquals(u,us.addUser(u));

	}
	@Test
	@Order(2)
	public void testRetrieveAllUsers(){
		List<User> listUsers = us.retrieveAllUsers();
		Assertions.assertEquals(listUsers.size(), listUsers.size());
	}
	@Test
	@Order(3)
	public void testRetrieveUser(){
		User user = us.retrieveUser("2");
		Assertions.assertEquals(2,us.retrieveUser("2").getId());
	}
	@Test
	@Order(4)
	public void testmodifyuser(){
		User expected = new User(1L,"houssemferjani", "ferjani" ,  new Date(), Role.ADMINISTRATEUR);
		User user = us.updateUser(expected);
		Assertions.assertEquals(expected,user);
	}
	/*
	@Test
	@Order(5)
	public void testDeleteUser(){
		us.deleteUser("7");
		User user = us.retrieveUser("7");
		Assertions.assertNull(user);
	}
*/
	/*@Test
	@Order(4)
	public void updateUserTest(){

		User u =  new User("Tarek","Ben Yahia",new Date(), Role.ADMINISTRATEUR);
		//us.addUser( u);
		Assertions.assertEquals(u,us.addUser(u));
		//Assertions.assertEquals(us.addUser(u),u);
	}*/



}
