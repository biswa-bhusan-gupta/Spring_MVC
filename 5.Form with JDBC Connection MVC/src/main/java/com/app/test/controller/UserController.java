package com.app.test.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.test.entities.User;
import com.app.test.repo.UserRepository;
import com.app.test.services.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService serv;
//	UserRepository repo;
	

	
	@ModelAttribute
	public void commonDataForModel(Model model) {
		model.addAttribute("Header","Model and View");
		System.out.println("Model and View");
	}
	
	@RequestMapping("/Form")
	public String showForm() {
		System.out.println("Fill Form Details");
		return "form.jsp";
	}
	
	@RequestMapping(path="/processForm",method=RequestMethod.POST)
	public String handleForm2(@ModelAttribute("user") User user,Model model) { // Params gets binds to Fields in User 
		
		
		if(user.getName().isBlank() || user.getEmail().isBlank() || user.getPassword().isBlank()) {
			return "redirect:/Form";
		}
		
		model.addAttribute("User",user);
		
//		repo.save(user);
        int Id=serv.saveUser(user); // Storing User Object in Database
        model.addAttribute("Id",Id);
        
		System.out.println("Display Form Details");
		System.out.println(user);
		
	
		return "success.jsp";
	}
}


