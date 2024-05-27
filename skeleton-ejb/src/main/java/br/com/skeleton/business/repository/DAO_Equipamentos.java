package br.com.skeleton.business.repository;

import java.util.List;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

import br.com.skeleton.business.entity.Entity_Equipamentos;

@RequestScoped
public class DAO_Equipamentos {

    @Inject
    private EntityManager manager;

    public DAO_Equipamentos() {
    }

    public Entity_Equipamentos porId(long id) {
        return manager.find(Entity_Equipamentos.class, id);
    }

     public List<Entity_Equipamentos> pesquisar(String Equipamento) {
        CriteriaBuilder criteriaBuilder = manager.getCriteriaBuilder();
        CriteriaQuery<Entity_Equipamentos> criteriaQuery = criteriaBuilder.createQuery(Entity_Equipamentos.class);
        Root<Entity_Equipamentos> root = criteriaQuery.from(Entity_Equipamentos.class);
        
        criteriaQuery.select(root);
        criteriaQuery.where(criteriaBuilder.like(root.get("equipamento"), Equipamento + "%"));
        TypedQuery<Entity_Equipamentos> query = manager.createQuery(criteriaQuery);
        return query.getResultList(); 
    }
    
     public List<Entity_Equipamentos> todos() {
    	    CriteriaBuilder criteriaBuilder = manager.getCriteriaBuilder();
    	    CriteriaQuery<Entity_Equipamentos> criteriaQuery = criteriaBuilder.createQuery(Entity_Equipamentos.class);
    	    Root<Entity_Equipamentos> root = criteriaQuery.from(Entity_Equipamentos.class);
    	    
    	    criteriaQuery.select(root);
    	    
    	    TypedQuery<Entity_Equipamentos> query = manager.createQuery(criteriaQuery);
    	    return query.getResultList(); 
    	    }

    public Entity_Equipamentos salvar(Entity_Equipamentos equipamento) {
        return manager.merge(equipamento);
    }

    public void excluir(Entity_Equipamentos equipamento) {
        equipamento = porId(equipamento.getId());
        manager.remove(equipamento);
    }
}
