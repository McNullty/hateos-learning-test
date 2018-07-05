package com.mladen.cikara.hateos;

import org.springframework.hateoas.Link;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonResourceController {

	@RequestMapping("/person")
	public ResponseEntity<PersonResource> person() {
		
		PersonResource resource = new PersonResource();
		resource.firstname = "Dave";
		resource.lastname = "Matthews";
		resource.add(new Link("http://myhost/people"));
		
		return new ResponseEntity<PersonResource>(resource, HttpStatus.OK);
	}
}
