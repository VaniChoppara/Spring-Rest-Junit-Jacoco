package com.app.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.app.dao.UserDAO;

@SpringBootTest
@ExtendWith(value = MockitoExtension.class)
public class UserServiceTest {

	@MockBean
	UserDAO userDao;
	
	@InjectMocks
	UserService userService;
	
	@Test
	public void testGetUser() {
		when(userDao.getUser()).thenReturn("Ravi");
		String user = userService.getUser();
		assertNotNull(user);
	}
	
	@Test
	public void testGetDob() {
		UserService userService = spy(new UserService());
		when(userService.getDob()).thenReturn("10-02-2024");
		String user = userService.getDob();
		assertNotNull(user);
	}
}
