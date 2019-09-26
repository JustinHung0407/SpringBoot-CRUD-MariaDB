package com.example.demo.model;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

//Finished
//get with path variable
//CRUD
//MariaDB

@RestController
//@RequestMapping(path="/") 
public class MainController {
	@Autowired
	private UserRepository userRepository;

	/*
	 * create user (old)
	 * 
	 * @RequestMapping(path="/add", method= RequestMethod.GET) // Map ONLY GET
	 * Requests public @ResponseBody String addNewUser (@RequestParam String name
	 * , @RequestParam String email) {
	 * 
	 * User n = new User(); n.setName(name); n.setEmail(email);
	 * userRepository.save(n); return "Saved"; }
	 */

	// create user
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	@ResponseBody
	public String addUser(@RequestBody User user) {
		this.userRepository.save(user);
		return "success";
	}

	// read all user
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public @ResponseBody Iterable<User> getAllUsers() {
		return userRepository.findAll();
	}

	// read certain user
	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
	public Optional<User> get(@PathVariable("id") Long id) {
		// Long userId = Long.parseLong(id);
		return userRepository.findById(id);
	}

	// update user
	@RequestMapping(value="/user/{name}",method = RequestMethod.PUT)
	public String updateUser(@RequestBody User updateUser) {
		{
			User userFromDb = userRepository.findByName(updateUser.getName());
			System.out.println(userFromDb.getName()+"user");
			System.out.println(updateUser.getName()+"updateuser");
			updateUser.setId(userFromDb.getId());
			userRepository.save(updateUser);
			return "Updated"; 
		}
	}
	
	// delete
	@RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
	public String delete(@PathVariable String id) {
		System.out.print(id);
		Long userId = Long.parseLong(id);
		userRepository.deleteById(userId);
		String result = "Suceess";
		return result;
	}
}