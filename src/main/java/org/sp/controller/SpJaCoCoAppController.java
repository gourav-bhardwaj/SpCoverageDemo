package org.sp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jacoco")
public class SpJaCoCoAppController {

	@GetMapping("/first")
	public ResponseEntity<?> firstController() throws Exception {
		return ResponseEntity.ok().body("It is a first controller!!");
	}

	@GetMapping("/second")
	public ResponseEntity<?> secondController() throws Exception {
		return ResponseEntity.ok().body("It is a second controller!!");
	}

}
