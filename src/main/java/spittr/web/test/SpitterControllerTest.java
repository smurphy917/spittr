package spittr.web.test;

import static org.junit.Assert.*;

import spittr.Spitter;
import spittr.data.SpitterRepository;
import spittr.web.SpitterController;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.*;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

public class SpitterControllerTest {

	@Test
	public void shouldShowRegistration() throws Exception{
		SpitterRepository mockRepository = mock(SpitterRepository.class);
		SpitterController controller = new SpitterController(mockRepository);
		MockMvc mockMvc = standaloneSetup(controller).build();
		
		mockMvc.perform(get("/spitter/register"))
		.andExpect(view().name("registerForm"));
	}
	
	@Test
	public void shouldProcessRegistration() throws Exception{
		Spitter unsaved = new Spitter("user123","pwd123","first","last");
		Spitter saved = new Spitter(24L,"user123","pwd123","first","last");
		SpitterRepository mockRepository = mock(SpitterRepository.class);
		when(mockRepository.save(unsaved)).thenReturn(saved);
		
		SpitterController controller = new SpitterController(mockRepository);
		MockMvc mockMvc = standaloneSetup(controller).build();
		
		mockMvc.perform(post("/spitter/register")
				.param("firstName","first")
				.param("lastName","last")
				.param("username","user123")
				.param("password","pwd123"))
			.andExpect(redirectedUrl("/spitter/user123"));
		
		verify(mockRepository, atLeastOnce()).save(unsaved);
		
	}

}
