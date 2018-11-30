package com.example.springmvc.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Eletrodomestico {

	private Long id;
	private String nome;
	private Double potencia;
	
	public Eletrodomestico() {}

	public Eletrodomestico(Long id, String nome, Double potencia) {
		this.id = id;
		this.nome = nome;
		this.potencia = potencia;
	}
}
