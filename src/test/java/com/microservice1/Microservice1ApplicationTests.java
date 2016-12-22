package com.microservice1;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;
import com.microservice1.controller.Microservice1Controller;
import com.microservice1.service.Microservice1Service;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Microservice1Application.class)
public class Microservice1ApplicationTests {

	Microservice1Service service = Mockito.mock(Microservice1Service.class);

	@Before
	public void setup() {
		RestAssuredMockMvc.standaloneSetup(new Microservice1Controller(service));
	}

	@Test
	public void contextLoads() {
	}

}
