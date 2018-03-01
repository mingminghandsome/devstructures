package com.wish.mm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 
 * @author mingminghandsome
 *
 */
@RestController
public class HelloWorldController {

	@RequestMapping("/")
	public String sayHello() {
		return "HelloWorld";
	}
}