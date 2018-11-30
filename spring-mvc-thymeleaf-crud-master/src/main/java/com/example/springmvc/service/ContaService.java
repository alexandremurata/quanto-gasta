package com.example.springmvc.service;

import java.util.List;

import com.example.springmvc.model.Conta;
import com.example.springmvc.repository.ContaRepository;

public class ContaService {

	private ContaRepository repository = new ContaRepository();

	public void save(Conta conta) {
		repository.save(conta);
	}
	
	public List<Conta> findAll(){
		return repository.findAll();
	}

	public Conta findOne(String id) {
		// TODO Auto-generated method stub
		return repository.findOne(id);
	}

	public void delete(final String id) {
		repository.delete(id);
		// TODO Auto-generated method stub
		
	}
}
