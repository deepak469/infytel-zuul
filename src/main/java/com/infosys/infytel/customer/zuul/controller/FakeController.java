package com.infosys.infytel.customer.zuul.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FakeController {
	
	@RequestMapping("/login")
	public String fakeMethod() {
		return "fake through zuul";
	}

}
