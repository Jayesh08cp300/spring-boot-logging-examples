package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LogController {
	private static final Logger logger = LoggerFactory.getLogger(LogController.class);

	@GetMapping("/log/{msg}")
	public String printMe(@PathVariable String msg) {
		logger.info("this is a info message");
		logger.warn("this is a warn message");
		logger.error("this is a error message");
		return msg;
	}
}
