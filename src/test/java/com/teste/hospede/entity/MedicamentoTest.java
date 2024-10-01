package com.teste.hospede.entity;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MedicamentoTest {

	private Medicamento medicamento;
	@BeforeEach
	void setUp() {
	//Arrange
		medicamento = new Medicamento(1L,"julia","julia.duarte@gmail.com","30257601");
		
	}
	@Test
	@DisplayName("Testando o getter and setter do Id")
	void testId() {
	//Act
	medicamento.setId(2L);
	//Assert
	assertEquals(2L, medicamento.getId());
	
	}
	@Test
	@DisplayName("Testando o getter and setter do Nome")
	void testNome() {
	//Act
	medicamento.setNome("buscopan");
	//Assert
	assertEquals("buscopan", medicamento.getNome());

	}
	@Test
	@DisplayName("Testando o getter and setter da Bula")
	void testBula() {
	//Act
	medicamento.setBula("remedio");
	//Assert
	assertEquals("remedio", medicamento.getBula());
	
	}
	@Test
	@DisplayName("Testando o getter and setter da Data de validade")
	void testDataValidade() {
	//Act
	medicamento.setDataValidade("18/10/2026");
	//Assert
	assertEquals("18/10/2026", medicamento.getDataValidade());
	
	}
	@Test
	@DisplayName("Testando o construtor")
	void testContrutorAll() {
		//Act
		Medicamento novoMedicamento = new Medicamento (3L,"dorflex","remedio","amanha");
		assertAll("novoMedicamento",
				()-> assertEquals(3L, novoMedicamento.getId()),
				()-> assertEquals("dorflex", novoMedicamento.getNome()),
				()-> assertEquals("remedio", novoMedicamento.getBula()),
				()-> assertEquals("amanha", novoMedicamento.getDataValidade()));
	}
	
	
}