package com.example.springmvc.rules.tarifa;

public class TarifaBandeiraVerde implements Tarifa {
	private static final Double TARIFA_ADICIONAL = 0.0;

	@Override
	public Double getTarifaFinal() {
		return this.TARIFA_ADICIONAL * this.TARIFA_POR_CONSUMO;
	}
}
