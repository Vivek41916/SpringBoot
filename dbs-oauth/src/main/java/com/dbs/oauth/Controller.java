package com.dbs.oauth;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping("/home")
	public String Home() {
		return "<h1> Hello world!</h1>";
	}

}
