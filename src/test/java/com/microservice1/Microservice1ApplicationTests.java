package com.microservice1;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;
import com.microservice1.controller.Microservice1Controller;
import com.microservice1.model.ContentMetadata;
import com.microservice1.service.Microservice1Service;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest(classes = Microservice1Application.class)
public class Microservice1ApplicationTests {

	@Mock
	Microservice1Service service;
	@Mock
	ContentMetadata contentMetadata;

	@Before
	public void setup() {
		//contentMetadata.setHttpStatus(HttpStatus.OK);
		contentMetadata=new ContentMetadata();
		contentMetadata.setHttpStatus(HttpStatus.OK);
		contentMetadata.setAssetId("id10");
		//BDDMockito.given(contentMetadata.getHttpStatus()).willReturn(HttpStatus.OK);
		//BDDMockito.given(service.getContentDetails(BDDMockito.anyString())).willReturn(contentMetadata);
		BDDMockito.given(service.getContentDetails(BDDMockito.anyString())).willReturn(contentMetadata);
		RestAssuredMockMvc.standaloneSetup(new Microservice1Controller(service));
	}

	@Test
	public void contextLoads() {
	}

}
