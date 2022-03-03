package net.com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.com.springboot.entity.User;
import net.com.springboot.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public User saveUser(User user) {
		return userRepository.save(user);
	}

	public List<User> saveUser(List<User> user) {
		return (List<User>) userRepository.saveAll(user);
	}

	public List<User> getUser() {
		return (List<User>) userRepository.findAll();

	}

	public User getUserById(int userid) {
		return userRepository.findById((int) userid).orElse(null);
	}

	public String deleteUser(int userid) {
		userRepository.deleteById(userid);
		return "User Removed Sucessfully";

	}

	public User updateUser(User user) {
		User existingUser = userRepository.findById((int) user.getUserid()).orElse(null);
		existingUser.setFirstname(user.getFirstname());
		existingUser.setLastname(user.getLastname());
		existingUser.setContact(user.getContact());
		existingUser.setAddress(user.getAddress());
		existingUser.setJob(user.getJob());
		existingUser.setRole(user.getRole());
		existingUser.setStatus(user.getStatus());
		return userRepository.save(existingUser);

	}

	

}
