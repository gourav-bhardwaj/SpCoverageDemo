package org.sp;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.sp.controller.SpJaCoCoAppController;
import org.springframework.http.ResponseEntity;

@RunWith(MockitoJUnitRunner.class)
public class SpJaCoCoControllerTests {

	@InjectMocks
	SpJaCoCoAppController controller;
	
	@Test
	public void firstHandlerTEST() throws Exception {
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
