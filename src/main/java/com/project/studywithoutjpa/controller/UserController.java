package com.project.studywithoutjpa.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

	/**
	 * Get all users list.
	 *
	 * @return the list
	 */
	@GetMapping
	@RequestMapping("/")
	public ResponseEntity<?> findAll(
		@RequestParam(required = false, defaultValue = "") String filter
	) {
        return new ResponseEntity<>("Hello World", HttpStatus.OK);
	}
}
