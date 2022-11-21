package com.app.test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
//	 @RequestMapping("home")  // For which Path Request of Client Server is going to show WebPage
//	 @ResponseBody // If it is Response Body then it outputs data in WebApp
//	 public String home(@RequestParam("name") String myName,HttpSession session) { // Client sends data "?****='Biswa25'",Server recieves from client as Request Param (name=****) and assign it as myName
		 
//	 public String home(HttpServletRequest req,HttpServletRequest res) {  // Request Object "req" is used to Fetch Data from Client
//		 HttpSession session =  req.getSession(); // Session sends Data recieved from Client in WebPage to JSP File
		 
//		 String myName = req.getParameter("name"); // Fetches from Client in WebPage as "?name='Biswa'"
		 
//    	 System.out.println("Hello World " + myName); // Will show output in Console or Server
//    	 session.setAttribute("Name", myName); // Sending "Name" as myName fetched from Client in WebApp to JSP File
    	 
//    	 return "home"; // If Prefix and Suffix ,Prefix Shows Directory,Suffix shows File Extension
//    	 return "home.jsp" // If it is only Request Mapping then it redirects to JSP File  // If no Prefix and Suffix
	 
	
	 @RequestMapping("home") 
//	 public ModelAndView home(@RequestParam("name") String myName) {
		 public ModelAndView show(Alien al) { //Recieves Data from Client as Object // Creation of Object for Alien Class
		 
		 ModelAndView mv = new ModelAndView(); // mv as Object
		 
		 System.out.println("Object : "+al);
//		 mv.addObject("name",myName); // Sends Data recieved from Client in WebPage to JSP File
		 mv.addObject("obj",al);
		 mv.setViewName("home");
		 
		 return mv;
     }
}

