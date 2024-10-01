package com.teste.hospede.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "reserva")
public class Reserva {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
	private Long id;
	@ManyToOne
	@JoinColumn(name = "id_Hospede", nullable = false)
	private Hospede hospede;
	@ManyToOne
	@JoinColumn(name = "id_Quarto", nullable = false)
	private Quarto quarto;
	
	private LocalDate checkInData;

	
	private LocalDate checkOutData;
}