package org.sp.controller;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

public class SpJacocoControllerTest {

	@InjectMocks
	SpJaCoCoAppController controller;
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void firstHandlerTest() throws Exception {
		ResponseEntity<?> response = controller.firstController();
		assertEquals(200, response.getStatusCodeValue());
		assertNotNull(response.getBody());
		assertEquals("It is a first controller!!", response.getBody());
	}
	
	@Test
	public void secondHandlerTest() throws Exception {
		ResponseEntity<?> response = controller.secondController();
		assertEquals(200, response.getStatusCodeValue());
		assertNotNull(response.getBody());
		assertEquals("It is a second controller!!", response.getBody());
	}
	
}
