package org.sp.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import  org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;

@RunWith(MockitoJUnitRunner.class)
public class SpJacocoControllerTest {

	@InjectMocks
	SpJaCoCoAppController controller;
	
	@Test
	public void firstHandlerTest() throws Exception {
		ResponseEntity<?> response = controller.firstController();
		assertEquals(200, response.getStatusCodeValue());
		assertNotNull(response.getBody());
		assertEquals("It is a one controller!!", response.getBody());
	}
	
	@Test
	public void secondHandlerTest() throws Exception {
		ResponseEntity<?> response = controller.secondController();
		assertEquals(200, response.getStatusCodeValue());
		assertNotNull(response.getBody());
		assertEquals("It is a two controller!!", response.getBody());
	}
	
}
