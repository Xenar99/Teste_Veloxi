package br.com.skeleton.business.entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Entity_Equipamentos")
public class Entity_Equipamentos {

	protected String ID;
	protected String Equipamento;
	protected String Descricao;
	protected String DataAquisicao;
	protected String Valor;
	protected String DataValidade;

	public Entity_Equipamentos() {

	}

	public Entity_Equipamentos(String iD, String equipamento, String descricao, String dataAquisicao, String valor,
			String dataValidade) {
		super();
		
		ID = iD;
		Equipamento = equipamento;
		Descricao = descricao;
		DataAquisicao = dataAquisicao;
		Valor = valor;
		DataValidade = dataValidade;

	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getEquipamento() {
		return Equipamento;
	}

	public void setEquipamento(String equipamento) {
		Equipamento = equipamento;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public String getDataAquisicao() {
		return DataAquisicao;
	}

	public void setDataAquisicao(String dataAquisicao) {
		DataAquisicao = dataAquisicao;
	}

	public String getValor() {
		return Valor;
	}

	public void setValor(String valor) {
		Valor = valor;
	}

	public String getDataValidade() {
		return DataValidade;
	}

	public void setDataValidade(String dataValidade) {
		DataValidade = dataValidade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entity_Equipamentos other = (Entity_Equipamentos) obj;
		return Objects.equals(ID, other.ID);
	}

	@Override
	public String toString() {
		return "Entity_Equipamentos [ID=" + ID + "]";
	}


}