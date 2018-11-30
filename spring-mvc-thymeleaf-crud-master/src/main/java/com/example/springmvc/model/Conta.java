package com.example.springmvc.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Conta {

	private Integer id;
	private String mesAno;
	private Double totalValor;
	private Double totalKWH;
	private List<Consumo> consumos;
	
	public Conta() {}

	public Conta(Integer id, String mesAno, Double totalValor, Double totalKWH, List<Consumo> consumos) {
		super();
		this.id = id;
		this.mesAno = mesAno;
		this.totalValor = totalValor;
		this.totalKWH = totalKWH;
		this.consumos = consumos;
	}
	
	
}
