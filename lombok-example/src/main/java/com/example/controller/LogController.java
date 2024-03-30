package com.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Slf4j
public class LogController {

	@GetMapping("/log/{msg}")
	public String printMe(@PathVariable String msg) {
		log.info("this is a info message.");
		log.warn("this is a warn message.");
		log.error("this is a error message.");
		return msg;
	}
}
