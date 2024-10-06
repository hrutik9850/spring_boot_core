package com.nt.controller;

import java.io.PrintWriter;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class ShowHomeController {
	
	/*	@RequestMapping("/home")
		public String showHomePage() {
			return "welcome";
		}*/
	
	
	/*@GetMapping("/home")
	public String showHomePage() {
		return "welcome";
	}*/
		
	/*@RequestMapping("/")
	public String showHomePage(Map<String ,Object> map) {
		System.out.println("Shared Memory obj's class::"+map.getClass());
	// add model attributes to request scope 
		map.put("attr1","val1");
		map.put("sysDate", new Date());
		return "welcome";
	}
	
	*/
	
	
	/*@RequestMapping("/")
	public String showHomePage(ModelMap map) {
		System.out.println("Shared Memory obj's class::"+map.getClass());
	// add model attributes to request scope 
		map.put("attr1","val1");
		map.put("sysDate", new Date());
		return "welcome";
	}
	
	//here we need to create Shared Memory to place the Model attributes manullay, more ober 
	 * the LvN will request path itSelf .
	 * 
	 * if the  controller class handler method is not return the LVM the the method request path it self  become the default Lvm...
	 *  for example: if the request path is "/home" the default LVM is "home",
	*/
	
	
	/*@RequestMapping("/welcome")
	public BindingAwareModelMap showHomePage() {
		BindingAwareModelMap model = new BindingAwareModelMap();
		System.out.println("Shared Memory obj's class::"+model.getClass());
	// add model attributes to request scope 
		model.put("attr1","val1");
		model.put("sysDate", new Date());
		return model;
	}*/
	 
	/*	
		@RequestMapping("/reandering")
		public Map<String,Object> showHomePage() {
			Map<String,Object>  model = new HashMap<>();
			System.out.println("Shared Memory obj's class::"+model.getClass());
		// add model attributes to request scope 
			model.put("attr1","val1");
			model.put("sysDate", new Date());
			return model;
		}
		*/
	
	// what happens if the return type of Handler method is void?
	// the request path of handler method will be taken as the LVM
	//it takes "reandering" (request path) as the Logical vie name
	/*	
		@RequestMapping("/reandering")
		public void showHomePage(Map<String,Object> map) {
			
			System.out.println("Shared Memory obj's class::"+map.getClass());
			// add model attributes to request scope 
			map.put("attr1","val1");
			map.put("sysDate", new Date());
			
		}*/
	
	//What hapens if the handler method return null?
	// the request path of handler method will be taken as the LVN
	//it takes "reandering" (request path) as the Logical vie name

	
	/*@RequestMapping("/reandering")
	public String showHomePage(Map<String,Object> map) {
		
		System.out.println("Shared Memory obj's class::"+map.getClass());
		// add model attributes to request scope 
		map.put("attr1","val1");
		map.put("sysDate", new Date());
		return null;
		
	}
	 */
	//How can we forward the request from one handler method to another handler method?
	// This is called handler method chaining i.e the request given to one handier method will communicate with 
	//another handier method of same or different controller class
	
	/*
	@RequestMapping("/reandering")
	public String showHomePage(Map<String,Object> map) {
		System.out.println("ShowHomeController.showHomePage()");
		return "forward:report";
		
	}
	
	@RequestMapping("/report")
	public String showreportPage(Map<String,Object> map) {
		System.out.println("ShowHomeController.showreportPage()");
		return "welcome";
		
	}
	 */
	
	/*	Here the source handler method directly communicates with dest handle method.. it internally uses 
		dest handler method after having network round trip with browser.so the source handler method and the 
		dest handler method will not use same req.res objs.
		*/
	
	
	
	//How can we redirect one handler method request to another handler method 
	// this is also called HandlerMethod chaining.but source Handler method redirect the request to dest handler method after having round trip
	// trip with browser so the source  handler method and 
	// the dest handler method will not use same req,res objs
	
	
	
	//in Controller class
	
	/*@RequestMapping("/welcome")
	public String process(HttpServletRequest req) {
		System.out.println("ShowHomeController.process()"+req.hashCode());
		req.setAttribute("attr1", "val1");
		return "redirct:report";
	}
	
	@RequestMapping("/report")
	public String showreport(HttpServletRequest req) {
		System.out.println("req attribute:"+req.getAttribute("attr1"));
		System.out.println("ShowHomeController.showreport()"+req.hashCode());
	
		return "home";
	}*/
	
	
	// how to get request response object in the handler methods?
	//--> we can take them as the parameters of the handles method so the DispatcherServlet
	//can  pass them as argument where calling the method
	
	/*	@RequestMapping("/welcome")
		public String process(HttpServletRequest req ,HttpServletResponse res) {
			System.out.println("ShowHomeController.process()"+req.hashCode());
			req.setAttribute("attr1", "val1");
			return "reandering";
		}*/
	
	
	
	//How to pass HttpSession object oth handler method of controller class>
//	--> we can take HttpSession as the parameter value of the handler method 
	
	
	/*
	@RequestMapping("/welcome")
	public String process(HttpSession scan) {
		System.out.println("ShowHomeController.process()");
		scan.setAttribute("attr1", "val1");
		return "reandering";
	}
	*/
	
	
	//How to pass SErvelcongi object and servletContext objs to  c
//	controller class handler methods
//	--> Inject them to @Controller class using @Autowired annotation
	
	@Autowired
	private ServletContext sc;
	@Autowired
	private ServletConfig cg ;
	
	@RequestMapping("/welcome")
	public String process (Map<String ,Object> map) {
		System.out.println("web application context path::"+sc.getContextPath());
		System.out.println("Ds Login name::"+cg.getServletName());
		map.put("attr1", "val1");
		return" reandering";
	}
	
	/*@RequestMapping("/home")
	public void showtextInBo (HttpServletResponse res) throws Exception {
	
		PrintWriter pw = res.getWriter();
		//set response content type
		res.setContentType("text/html");
		//write data to browser s/w
		pw.println("<b> directly from handler method </b>");
	}
	
	*/	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
