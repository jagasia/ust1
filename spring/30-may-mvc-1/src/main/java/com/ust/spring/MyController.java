package com.ust.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

	@GetMapping("/home")
	public String home()
	{
		return "index";		//is prefixed and suffixed /WEB-INF/views/index.jsp
	}
}
