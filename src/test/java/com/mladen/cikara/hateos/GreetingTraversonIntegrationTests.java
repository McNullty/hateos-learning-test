package com.mladen.cikara.hateos;

import static org.assertj.core.api.Assertions.assertThat;

import java.net.URI;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.hateoas.MediaTypes;
import org.springframework.hateoas.client.Traverson;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class GreetingTraversonIntegrationTests {

  @LocalServerPort
  private int port;

  @Test
  public void envEndpointNotHidden() throws Exception {
    final Traverson traverson =
        new Traverson(new URI("http://localhost:" + port + "/greeting"), MediaTypes.HAL_JSON);
    final String greeting = traverson.follow("self").toObject("$.content");
    assertThat(greeting).isEqualTo("Hello, World!");
  }
}
