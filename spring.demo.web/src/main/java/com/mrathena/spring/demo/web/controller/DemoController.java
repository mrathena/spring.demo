package com.mrathena.spring.demo.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mrathena
 */
@RestController
@RequestMapping("demo")
public class DemoController {

	@GetMapping("hello")
	public Object hello() {
		return "hello world";
	}

}
