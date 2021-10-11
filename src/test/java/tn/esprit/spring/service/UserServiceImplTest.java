package tn.esprit.spring.service;
import java.util.List;


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

	@Test
	public void testRetrieveAllUsers(){
		List<User> listUsers = us.retrieveAllUsers();
		Assertions.assertEquals(0, listUsers.size());
	}


}
