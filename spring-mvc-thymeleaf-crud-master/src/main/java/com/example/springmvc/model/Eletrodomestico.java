package com.example.springmvc.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Eletrodomestico {

	private Integer id;
	private String nome;
	private Double potencia;
	
	public Eletrodomestico() {}

	public Eletrodomestico(Integer id, String nome, Double potencia) {
		super();
		this.id = id;
		this.nome = nome;
		this.potencia = potencia;
	}
}
