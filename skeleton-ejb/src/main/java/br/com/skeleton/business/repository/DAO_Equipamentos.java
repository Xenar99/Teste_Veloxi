package br.com.skeleton.business.repository;

import java.io.Serializable;
import java.util.List;

import com.mysql.cj.Query;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import br.com.skeleton.business.entity.Entity_Equipamentos;

public class DAO_Equipamentos {

	private static final long serialVersionUID = 1L;

	private EntityManager manager;

	public DAO_Equipamentos() {

	}

	public DAO_Equipamentos (EntityManager manager) {
		this.manager = manager;
	}
	
	public Entity_Equipamentos  porId(long id) {
		return manager.find(Entity_Equipamentos.class, id);
	}
	
	public List<Entity_Equipamentos> pesquisar (String Equipamento){
		TypedQuery<Entity_Equipamentos> query = manager
				.createQuery("from Entity_Equipamentos where Equipamento like :Equipamento", Entity_Equipamentos.class);
		query.setParameter("Equipamento", Equipamento + "%");
		query.getResultList();
		return null;
	}
	
	public Entity_Equipamentos Salvar(Entity_Equipamentos equipamento) {
		
		return manager.merge(equipamento);
	}
	
	public void Excluir (Entity_Equipamentos equipamento) {
		equipamento = porId(equipamento.getID());
		manager.remove(equipamento);
	}
}
