package com.example.springmvc.service;

import java.util.List;

import com.example.springmvc.model.Consumo;
import com.example.springmvc.repository.ConsumoRepository;

public class ConsumoService {
	private ConsumoRepository repository = new ConsumoRepository();

	public void save(Consumo consumo) {
		repository.save(consumo);
	}
	
	public List<Consumo> findAll(){
		return repository.findAll();
	}

	public Consumo findOne(Integer id) {
		// TODO Auto-generated method stub
		return repository.findOne(id);
	}

	public void delete(final Integer id) {
		repository.delete(id);
		// TODO Auto-generated method stub
		
	}
}
