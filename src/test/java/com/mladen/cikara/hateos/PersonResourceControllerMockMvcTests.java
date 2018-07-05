package com.mladen.cikara.hateos;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import io.restassured.module.mockmvc.RestAssuredMockMvc;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class PersonResourceControllerMockMvcTests {

  @Autowired
  private MockMvc mockMvc;

  @Before
  public void setup() {
    RestAssuredMockMvc.mockMvc(mockMvc);
  }

  @Test
  public void testGettingPersonResource() {

    given()
        .log().all()
        .when()
        .get("/person")
        .then()
        .log().all()
        .statusCode(HttpStatus.OK.value())
        .body("firstname", equalTo("Dave"))
        .body("lastname", equalTo("Matthews"));
  }

}
