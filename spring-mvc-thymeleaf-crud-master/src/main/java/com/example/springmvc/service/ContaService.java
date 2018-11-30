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

	public Conta findOne(Integer id) {
		return repository.findOne(id);
	}

	public void fecharConta(Conta conta) {
		// TODO Auto-generated method stub
		
	}

}
