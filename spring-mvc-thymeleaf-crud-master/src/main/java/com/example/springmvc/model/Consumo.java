package com.example.springmvc.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Consumo {
	private Integer id;
	private Eletrodomestico eletrodomestico;
	private Double tempoUsoDiario;
	private Integer quantidade;
	
	public Consumo() {}

	public Consumo(Integer id, Eletrodomestico eletrodomestico, Double tempoUsoDiario, Integer quantidade) {
		super();
		this.id = id;
		this.eletrodomestico = eletrodomestico;
		this.tempoUsoDiario = tempoUsoDiario;
		this.quantidade = quantidade;
	}
}
