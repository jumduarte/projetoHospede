package com.teste.hospede.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.teste.hospede.entity.Hospede;

@DataJpaTest
class HospedeRepositoryTest {
	
	@Autowired
	private HospedeRepository hospedeRepository;
	
	@DisplayName("Testando o Save")
	@Test
	void testSalvarRepository() {
		// Given / Arrange
		Hospede hospede1 = new Hospede(null, "Julia Maria",
											"julia@gmail.com",
											"(00)0000-0000");
		
		// When / Act
		Hospede saveHospede = hospedeRepository.save(hospede1);
		
		// Then / Assert
		assertNotNull(saveHospede);
		assertTrue(saveHospede.getId() > 0);
	}
	
	@DisplayName("Testando get para todos hospedes")
	@Test
	void testGetAllRepository() {
		
		// Given / Arrange 
		Hospede hospede1 = new Hospede(null, "Julia Maria",
				"julia@gmail.com",
				"(00)0000-0000");
		
		Hospede hospede2 = new Hospede(null, "Julio Fernando",
				"julio@gmail.com",
				"(00)0000-0000");
		
		hospedeRepository.save(hospede1);
		hospedeRepository.save(hospede2);
		
		List<Hospede> hospedeList = hospedeRepository.findAll();
		
		assertNotNull(hospedeList);
		assertEquals(2, hospedeList.size());
	}
		
		@DisplayName("Testando GET by ID")
		@Test
		void testGetById() {
			
			Hospede hospede1 = new Hospede(null, "Julio Fernando",
					"julio@gmail.com",
					"(00)0000-0000");
			
			hospedeRepository.save(hospede1);
			
			Hospede saveHospede = hospedeRepository.findById(hospede1.getId()).get();
			
			assertNotNull(saveHospede);
			assertEquals(hospede1.getId(), saveHospede.getId());
		}
		@DisplayName("Testando o Update")
		@Test
		void testUpdateHospede() {
			Hospede hospede1 = new Hospede(null, "Julio Fernando",
					"julio@gmail.com",
					"(00)0000-0000");
			
			hospedeRepository.save(hospede1);
			
			Hospede saveHospede = hospedeRepository.findById(hospede1.getId()).get();
			hospede1.setNome("Isaac");
			hospede1.setEmail("isaac@gmail.com");
			
			Hospede updateHospede = hospedeRepository.save(saveHospede);
			
			assertNotNull(updateHospede);
			assertEquals("Isaac", updateHospede.getNome());
			assertEquals("isaac@gmail.com", updateHospede.getEmail());
		}
		@DisplayName("Testando o Dalete")
		@Test
		void testDeleteHospede() {
			
			Hospede hospede1 = new Hospede(null, "Julio Fernando",
					"julio@gmail.com",
					"(00)0000-0000");
					
			hospedeRepository.save(hospede1);
			
			hospedeRepository.deleteById(hospede1.getId());
			
			Optional<Hospede> hospedeOptional = hospedeRepository.findById(hospede1.getId());
			
			assertTrue(hospedeOptional.isEmpty());
		}
}
