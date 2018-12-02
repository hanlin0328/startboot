package com.spring.startboot.router;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(@RequestParam(value = "name", required  = false)String name)
	{ 	
		return "hello" + name;
	}
}
