package com.mladen.cikara.hateos;

import static org.junit.Assert.*;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.hateoas.Link;

public class PersonResourceTest {

	private static final Logger logger = LoggerFactory.getLogger(FundamentalsTest.class);
	
	@Test
	public void testPersonResourceBasicConstructor() {
		PersonResource resource = new PersonResource();
		resource.firstname = "Dave";
		resource.lastname = "Matthews";
		resource.add(new Link("http://myhost/people"));
		
		logger.info("Person resource: {}", resource);
		
		fail("Not yet implemented");
	}

}
