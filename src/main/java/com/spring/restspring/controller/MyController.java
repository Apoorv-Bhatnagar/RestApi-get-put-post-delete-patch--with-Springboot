package com.spring.restspring.controller;
import com.spring.restspring.entities.UserData;
import com.spring.restspring.services.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@Autowired
	private UserService cs;
	
	@GetMapping("/home")
    public String name()
    {
		return "this is home";
    }
	
	@GetMapping("/userdata")
	public List<UserData> getuserdata()
	{
		return this.cs.getuserdata();
	}
	
	@GetMapping("/userdata/{id}")
	public UserData getuser(@PathVariable int id)
	{
		return this.cs.getuserdata(id);
	}
	@PostMapping("/adddata")
	public List<UserData> adduserdata(@RequestBody UserData us)
	{
		return this.cs.adduserdata(us);
	}
	@DeleteMapping("/deletedata")
	public List<UserData> deleteuserdata(@RequestBody UserData us)
	{
		return this.cs.deleteuserdata(us);
	}
}
