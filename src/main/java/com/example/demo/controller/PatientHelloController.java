package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientHelloController {

	@RequestMapping(value="/")
	public String hello() {
		return "Patient Info Page!";
	}
}
