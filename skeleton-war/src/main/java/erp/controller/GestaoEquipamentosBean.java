package erp.controller;

import java.io.Serializable;
import java.util.List;

import br.com.skeleton.business.entity.Entity_Equipamentos;
import br.com.skeleton.business.repository.DAO_Equipamentos;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
public class GestaoEquipamentosBean implements Serializable {

	private static final long serialVersionUID = 1L;

    private Entity_Equipamentos equipamentos = new Entity_Equipamentos();
	@Inject
    private DAO_Equipamentos equipamento;

    public void salvar() {
    	System.out.println("Equipamento: " + equipamentos.getEquipamento() +
    			" - Descrição: " + equipamentos.getEquipamento() + 
    			" - Data de Aquisição: " + equipamentos.getDataAquisicao() + 
    			" - Valor(R$): " + equipamentos.getValor() + 
    			" - Data de Validade: " + equipamentos.getDataValidade());
    }
    private List<Entity_Equipamentos> listaequipamentos;

    public void todosEquipamentos() {
    	listaequipamentos =equipamento.pesquisar(""); 
    }
    public Entity_Equipamentos getEquipamentos() {
    	return equipamentos;
    }
    public List<Entity_Equipamentos> getListaEquipamentos(){
    	return listaequipamentos;
    }
}