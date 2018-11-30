package com.example.springmvc.service;

import java.util.List;

import com.example.springmvc.model.Eletrodomestico;
import com.example.springmvc.repository.EletrodomesticoRepository;

public class EletrodomesticoService {
	
	private EletrodomesticoRepository repository = new EletrodomesticoRepository();

	public void save(Eletrodomestico eletrodomestico) {
		repository.save(eletrodomestico);
	}
	
	public List<Eletrodomestico> findAll(){
		return repository.findAll();
	}

	public Eletrodomestico findOne(Long id) {
		// TODO Auto-generated method stub
		return repository.findOne(id);
	}

	public void delete(final Long id) {
		repository.delete(id);
		// TODO Auto-generated method stub
		
	}
}
