package com.teste.hospede.entity;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class QuartoTest {

	private Quarto quarto;
	
	@BeforeEach
	void setUp() {
		//Arrange
		quarto = new Quarto(1L, "118", "Solteiro" );
	}
	
	@Test
	@DisplayName ("Testando getter e setter do campo id")
	void testId() {
		//Act
		quarto.setId(2L);
		//Assert
		assertEquals(2L,quarto.getId());
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo num")
	void TestNome() {
		//Act
		quarto.setNum("120");
		//Assert
		assertEquals("120", quarto.getNum());
	}
	@Test
	@DisplayName("Testando o getter e setter do campo tipo")
	void TestTipo() {
		//Act
		quarto.setTipo("Solteiro");
		//Assert
		assertEquals("Solteiro", quarto.getTipo());

	}
	@Test
	@DisplayName("Testando o construtor com todos os argumentos")
	void testConstructorAll() {
		//Act
		Quarto novoQuarto = new Quarto(3L, "135", "Solteiro");
		//Assertion
		assertAll("novoHospede",
				()-> assertEquals(3L, novoQuarto.getId()),
				()-> assertEquals("135", novoQuarto.getNum()),
				()-> assertEquals("Solteiro", novoQuarto.getTipo()));
			

	}
}
