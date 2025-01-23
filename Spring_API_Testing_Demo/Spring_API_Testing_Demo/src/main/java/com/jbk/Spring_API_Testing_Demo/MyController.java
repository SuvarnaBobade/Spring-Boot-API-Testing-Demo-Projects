package com.jbk.Spring_API_Testing_Demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/W3School")
public class MyController {
	@RequestMapping(value = "/java", method = RequestMethod.GET)
	public String FirstApi() {
		return "java is OOPS language";

	}
	@RequestMapping(value = "/html", method = RequestMethod.PUT)
	public String SecondApi() {
		return "html is used for Frontend";
		
	}
	@RequestMapping(value = "/css", method = RequestMethod.POST)
	public String ThirdApi() {
		return "css is used for style";

	}
	@RequestMapping(value = "/mysql", method = RequestMethod.DELETE)
	public String FourthApi() {
		return "mysql is an database";
		
	}

}
