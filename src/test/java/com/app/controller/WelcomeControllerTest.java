package com.app.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.app.service.WelcomeService;

@WebMvcTest(controllers = WelcomeController.class)
public class WelcomeControllerTest {

	@MockBean
	private WelcomeService welcomeService;

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testWelcomeMsg() throws Exception 
	{
		when(welcomeService.getWelcomeMessage()).thenReturn("Dummy data");
		MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/welcome");
		MvcResult result = mockMvc.perform(request).andReturn();
		MockHttpServletResponse response = result.getResponse();
		assertEquals(response.getContentAsString(),"Dummy data");
		assertEquals(response.getStatus(),200);
	}

	@Test
	public void testGreetMsg() throws Exception
	{
		when(welcomeService.getGreetMessage()).thenReturn("Dummuy greet");
		MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/greet");
		MvcResult result = mockMvc.perform(request).andReturn();
		MockHttpServletResponse response = result.getResponse();
		assertEquals(response.getStatus(),200);
		
		
	}
}
