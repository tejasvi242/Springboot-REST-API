package net.com.springboot.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import net.com.springboot.entity.User;
import net.com.springboot.service.UserService;

@RestController
@RequestMapping("/api/v1")
public class UserController {

	@Autowired
	private UserService userservice;
     

	@GetMapping("/user")
	public List<User> findAlluser() {
		return userservice.getUser();
	}
	@PostMapping("/user")
	public User addUser(@RequestBody User user) {

		return userservice.saveUser(user);
	}

	@GetMapping("/user/{userid}")
	public User findUserById(@PathVariable int userid) {
		return userservice.getUserById(userid);

	}

	@PutMapping("/user/{userid}")
	public User updateUser(@RequestBody User user) {
		return userservice.updateUser(user);
	}

	@DeleteMapping("/user/{userid}")
	public String user(@PathVariable int userid) {
		return userservice.deleteUser(userid);
	}
}
