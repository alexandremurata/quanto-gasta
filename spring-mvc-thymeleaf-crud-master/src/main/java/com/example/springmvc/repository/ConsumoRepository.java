package com.example.springmvc.repository;

import java.util.Collections;
import java.util.List;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.query.Query;
import com.example.springmvc.model.Consumo;

public class ConsumoRepository {
	
	private final ObjectContainer container;
	
	public ConsumoRepository() {
		container = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "bd/consumos.db4o");
	}

	public void save(Consumo consumo) {
		container.store(consumo);
	}

	public List<Consumo> findAll() {
		final List<Consumo> consumos = container.queryByExample(Consumo.class);
		return Collections.unmodifiableList(consumos);
	}

	public Consumo findOne(final Integer id) {
		Query query = container.query();
		query.constrain(Consumo.class);
		List<Consumo> consumos = query.execute();
		for (Consumo consumo : consumos) {
			if(consumo.getId().equals(id)) {
				return consumo;
			}
		}
		return null;
	}

	public void delete(final Integer id) {
		Query query = container.query();
		query.constrain(Consumo.class);
		List<Consumo> consumos = query.execute();
		
		for (Consumo consumo : consumos) {
			if(consumo.getId().equals(id)) {
				container.delete(consumo);
				container.commit();
				break;
			}
		}
		
	}
}
