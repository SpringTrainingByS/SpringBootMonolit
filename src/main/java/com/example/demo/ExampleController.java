package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "index")
public class ExampleController {
	
	@RequestMapping(value = "test1", method = RequestMethod.GET) 
	public String index() {
		return "index";
	}

}
