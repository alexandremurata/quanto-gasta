package com.example.springmvc.repository;

import java.util.Collections;
import java.util.List;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.query.Query;
import com.example.springmvc.model.Eletrodomestico;

public class EletrodomesticoRepository {
	
	private final ObjectContainer container;
	
	public EletrodomesticoRepository() {
		container = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "bd/eletrodomesticos.db4o");
	}

	public void save(Eletrodomestico eletrodomestico) {
		container.store(eletrodomestico);
	}

	public List<Eletrodomestico> findAll() {
		final List<Eletrodomestico> eletrodomesticos = container.queryByExample(Eletrodomestico.class);
		return Collections.unmodifiableList(eletrodomesticos);
	}

	public Eletrodomestico findOne(final Integer id) {
		Query query = container.query();
		query.constrain(Eletrodomestico.class);
		List<Eletrodomestico> eletrodomesticos = query.execute();
		for (Eletrodomestico eletrodomestico : eletrodomesticos) {
			if(eletrodomestico.getId().equals(id)) {
				return eletrodomestico;
			}
		}
		return null;
	}

	public void delete(final Integer id) {
		Query query = container.query();
		query.constrain(Eletrodomestico.class);
		List<Eletrodomestico> eletrodomesticos = query.execute();
		
		for (Eletrodomestico eletrodomestico : eletrodomesticos) {
			if(eletrodomestico.getId().equals(id)) {
				container.delete(eletrodomestico);
				container.commit();
				break;
			}
		}
		
	}
}
