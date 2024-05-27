package erp.controller;

import java.io.Serializable;
import java.util.List;

import br.com.skeleton.business.entity.Entity_Equipamentos;
import br.com.skeleton.business.repository.DAO_Equipamentos;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@ViewScoped
public class GestaoEquipamentosBean implements Serializable {

	private static final long serialVersionUID = 1L;
    
	@Inject
    private DAO_Equipamentos equipamentos;
    
    private List<Entity_Equipamentos> listaequipamentos;
    
    public void todosEquipamentos() {
    	listaequipamentos =equipamentos.pesquisar(""); 
    }
    
    public List<Entity_Equipamentos> getListaEquipamentos(){
    	return listaequipamentos;
    }
}
