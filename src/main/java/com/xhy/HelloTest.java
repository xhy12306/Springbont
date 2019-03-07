package com.xhy;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloTest {

	@RequestMapping(value = "/hello/{text}")
	public String printHello(@PathVariable String text) {
		System.out.println(text);
		return text;
	}

	@RequestMapping(value = "/hello1")
	public String printHello1(@RequestParam(defaultValue="hello1") String text) {
		System.out.println(text);
		return text;
	}
}
