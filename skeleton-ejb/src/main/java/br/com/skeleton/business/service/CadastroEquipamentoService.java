package br.com.skeleton.business.service;
import br.com.skeleton.business.entity.Entity_Equipamentos;
import br.com.skeleton.business.repository.DAO_Equipamentos;
import br.com.skeleton.business.util.Transacional;
import jakarta.inject.Inject;

public class CadastroEquipamentoService {
	@Inject
	private DAO_Equipamentos equipamentos;

	@Transacional
	public void salvar(Entity_Equipamentos equipamento) {
		equipamentos.salvar(equipamento);
	}

	@Transacional
	public void excluir(Entity_Equipamentos equipamento) {
		equipamentos.excluir(equipamento);
	}
}
