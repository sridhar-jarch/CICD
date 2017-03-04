package com.websystique.springmvc.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.websystique.springmvc.service.UserService;

@RunWith(MockitoJUnitRunner.class)
public class HelloWorldRestControllerTest {
	@Mock
	private UserService userService;
	@InjectMocks
	private HelloWorldRestController helloWorldRestController;

	@Test
	public void testListAllUsers() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testGetUser() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testCreateUser() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testUpdateUser() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testDeleteUser() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testDeleteAllUsers() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

}
