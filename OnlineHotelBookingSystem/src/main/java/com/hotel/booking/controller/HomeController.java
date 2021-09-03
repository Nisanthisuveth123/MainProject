package com.hotel.booking.controller;





import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




@Controller
public class HomeController {
	//private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping("/")
	public String home() {
		
		return "welcome";
	}
	 
}
