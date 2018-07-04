package com.mladen.cikara.hateos;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.hateoas.Link;

public class FundamentalsTest {
	private static final Logger logger = LoggerFactory.getLogger(FundamentalsTest.class);
	
	@Test
	public void basicLinkTest() throws Exception {

		Link link = new Link("http://localhost:8080/something");
		
		logger.info(link.toString());
		
		assertThat(link.getHref(), is("http://localhost:8080/something"));
		assertThat(link.getRel(), is(Link.REL_SELF));

		Link link2 = new Link("http://localhost:8080/something", "my-rel");
		
		logger.info(link2.toString());
		
		assertThat(link2.getHref(), is("http://localhost:8080/something"));
		assertThat(link2.getRel(), is("my-rel"));

	}
}
