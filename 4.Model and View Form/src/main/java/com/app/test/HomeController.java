package com.app.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HomeController {
	
	@ModelAttribute
	public void commonDataForModel(Model model) {
		model.addAttribute("Header","Model and View");
		System.out.println("Model and View");
	}
	
	
//	@RequestMapping("/Model")
//	public String showWebPage1(Model model) {
//		model.addAttribute("Type","Model");			
//		return "redirect:/View";
//	}
	
	@RequestMapping("/Model")
	public RedirectView showWebPage1(Model model) {
		
		System.out.println("In Model");
		
		RedirectView redt = new RedirectView();
		redt.setUrl("/View");
		return redt;
	}
	
	
	@RequestMapping("/View")
	public String showWebPage2(Model model) {
		
		System.out.println("In View");

		
		model.addAttribute("Type","Model");	
		return "model";
	}
	
	@RequestMapping("/{Name}")
//	@ResponseBody
    public String showWebPage3(@PathVariable("Name") String name,Model model) {
		System.out.println(name);
		model.addAttribute("Name",name);
		return "home";
	} 	
	
	
	
	
	
	
	@RequestMapping("/Form")
	public String showForm() {
		System.out.println("Fill Form Details");
		return "form";
	}
	
//	@RequestMapping(path="/processForm",method=RequestMethod.POST)
//	public String handleForm1(@RequestParam("Email") String email,@RequestParam("Name") String name,@RequestParam("Password") String password,Model model) {
//		
	    // Type-1 :
//		model.addAttribute("Name",name);
//		model.addAttribute("Email",email);
//		model.addAttribute("Password",password);
//		
//		// Type-2 :
//		User user = new User();
//		user.setName(name);
//		user.setEmail(email);
//		user.setPassword(password);
//		model.addAttribute("User",user);
//		
//		
//		
//		System.out.println("Name : "+name+" Email :"+email+" Password : "+password);
//		return "test.jsp";
//	}
	
	@RequestMapping(path="/processForm",method=RequestMethod.POST)
	public ModelAndView handleForm2(@ModelAttribute("user") User user,Model model,BindingResult result) { // Params gets binds to Fields in User 
//    public String handleForm2(@ModelAttribute("user") User user,Model model,BindingResult result) { // Params gets binds to Fields in User 

		if(result.hasErrors()) {
			ModelAndView mv1 = new ModelAndView("form");
			return mv1;
		//  return "form";
		}
		 
		
//		if(user.getName().isBlank() || user.getEmail().isBlank() || user.getPassword().isBlank()) {
//			return "redirect:/Form";
//		}
		
		model.addAttribute("User",user);
		System.out.println("Display Form Details");
		
		ModelAndView mv2 = new ModelAndView("success");
		
		System.out.println(user);
		System.out.println(user.getAddress());
		
		return mv2;
//		return "success";

	
}
	
	
}
