package com.example.springmvc.rules;

import com.example.springmvc.rules.tarifa.Tarifa;
import com.example.springmvc.rules.tarifa.TarifaBandeiraAmarela;
import com.example.springmvc.rules.tarifa.TarifaBandeiraVerde;
import com.example.springmvc.rules.tarifa.TarifaBandeiraVermelha;

public class RegraTarifacao {

	public static Tarifa getTarifacaoFinal(final Long consumoTotal) {
		if (consumoTotal <= 1000) {
			return new TarifaBandeiraVerde();
		}
		if (consumoTotal <= 2000) {
			return new TarifaBandeiraAmarela();
		}
		return new TarifaBandeiraVermelha();
	}
}
