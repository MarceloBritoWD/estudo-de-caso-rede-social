package br.com.redesocial.postsservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping("/test")
	public ResponseEntity<String> testHere() {
		return new ResponseEntity<String>(new String("My Posts Service is working!!"), HttpStatus.OK);
	}
}