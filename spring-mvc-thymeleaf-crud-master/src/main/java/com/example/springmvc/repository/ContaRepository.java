package com.example.springmvc.repository;

import java.util.Collections;
import java.util.List;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.query.Query;
import com.example.springmvc.model.Conta;

public class ContaRepository {
	
	private final ObjectContainer container;
	
	public ContaRepository() {
		container = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "bd/contas.db4o");
	}

	public void save(Conta conta) {
		container.store(conta);
	}

	public List<Conta> findAll() {
		final List<Conta> contas = container.queryByExample(Conta.class);
		return Collections.unmodifiableList(contas);
	}

	public Conta findOne(final Integer id) {
		Query query = container.query();
		query.constrain(Conta.class);
		List<Conta> contas = query.execute();
		for (Conta conta : contas) {
			if(conta.getId().equals(id)) {
				return conta;
			}
		}
		return null;
	}

	public void delete(final Integer id) {
		Query query = container.query();
		query.constrain(Conta.class);
		List<Conta> contas = query.execute();
		
		for (Conta conta : contas) {
			if(conta.getId().equals(id)) {
				container.delete(conta);
				container.commit();
				break;
			}
		}
		
	}
}
