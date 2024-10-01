package com.teste.hospede.entity;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HospedeTest {
	
	private Hospede hospede;
	
	@BeforeEach
	void setUp() {
		//Arrange
		hospede = new Hospede(1L, "Julia Maria", "julia@gmail.com", "(00)0000-0000");
	}

	@Test
	@DisplayName ("Testando o getter e setter do campo id")
	void testId() {
		//Act
		hospede.setId(2L);
		//Assert
		assertEquals(2L,hospede.getId());
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo nome")
	void TestNome() {
		//Act
		hospede.setNome("Joao Paulo");
		//Assert
		assertEquals("Joao Paulo", hospede.getNome());
	}
	@Test
	@DisplayName("Testando o getter e setter do campo email")
	void TestEmail() {
		//Act
		hospede.setEmail("Joao@gmail.com");
		//Assert
		assertEquals("Joao@gmail.com", hospede.getEmail());

	}
	@Test
	@DisplayName("Testando o getter e setter do campo email")
	void TestTelefone() {
		//Act
		hospede.setTelefone("(11)1111-1111");
		//Assert
		assertEquals("(11)1111-1111", hospede.getTelefone());

	}
	@Test
	@DisplayName("Testando o construtor com todos os argumentos")
	void testConstructorAll() {
		//Act
		Hospede novoHospede = new Hospede(3L, "Isabely", "isabely@gmail.com","15-3333-3333");
		//Assertion
		assertAll("novoHospede",
				()-> assertEquals(3L, novoHospede.getId()),
				()-> assertEquals("Isabely", novoHospede.getNome()),
				()-> assertEquals("isabely@gmail.com", novoHospede.getEmail()),
				()-> assertEquals("15-3333-3333", novoHospede.getTelefone()));
	}
	
	
}
	
