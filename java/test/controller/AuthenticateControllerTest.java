package test.controller;



import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import test.service.UserService;


public class AuthenticateControllerTest {

	private AuthenticationController authenticationController;
	private UserService mockUserService;

	
	
	@Before
	public void setUp() {
	
		this.mockUserService = mock(UserService.class);
		this.authenticationController = new AuthenticationController(this.mockUserService);
	}


	@Test
	public void notNulltest() {
		
		String name = "joe";
		String password = "password";
		
		String answer = "joe:password";
		when(this.mockUserService.authenticate(Mockito.anyString(), Mockito.anyString())).thenReturn(answer);

		
		String result = this.authenticationController.autheticate(name, password);
		String expected = "joe:password";
		Assert.assertEquals(expected,result);
	}

}
