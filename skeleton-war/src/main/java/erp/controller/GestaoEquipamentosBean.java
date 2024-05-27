package erp.controller;

import java.io.Serializable;

import br.com.skeleton.business.entity.Entity_Equipamentos;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

@Named
@ViewScoped
public class GestaoEquipamentosBean implements Serializable {

	private static final long serialVersionUID = 1L;
    
    private Entity_Equipamentos equipamentos = new Entity_Equipamentos();
    
    public void salvar() {
    	System.out.println("Equipamento: " + equipamentos.getEquipamento() +
    			" - Descrição: " + equipamentos.getEquipamento() + 
    			" - Data de Aquisição: " + equipamentos.getDataAquisicao() + 
    			" - Valor(R$): " + equipamentos.getValor() + 
    			" - Data de Validade: " + equipamentos.getDataValidade());
    }
    public Entity_Equipamentos getEquipamentos() {
    	return equipamentos;
    }
}
