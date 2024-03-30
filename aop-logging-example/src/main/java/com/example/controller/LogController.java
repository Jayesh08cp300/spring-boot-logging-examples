package com.example.controller;

import com.example.aop.LoggingAdvice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LogController {

	Logger log = LoggerFactory.getLogger(LoggingAdvice.class);

	@GetMapping("/log/{msg}")
	public String printMe(@PathVariable String msg) {
		log.info("this is a info message.");
		log.warn("this is a warn message.");
		log.error("this is a error message.");
		return msg;
	}
}
