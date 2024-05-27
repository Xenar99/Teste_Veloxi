package br.com.skeleton.business.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "Entity_Equipamentos")
public class Entity_Equipamentos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long ID;
	@Column(name = "Equipamento", nullable = false, length = 80)
	protected String Equipamento;
	@Column(name = "Descricao", nullable = false, length = 100)
	protected String Descricao;
	@Column(name = "DataAquisicao", nullable = false, length = 8)
	protected LocalDate DataAquisicao;
	@Column(name = "Valor", nullable = false, length = 20)
	protected String Valor;
	@Column(name = "DataValidade", nullable = false, length = 8)
	protected LocalDate DataValidade;

	public Entity_Equipamentos() {

	}

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
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

	public LocalDate getDataAquisicao() {
		return DataAquisicao;
	}

	public void setDataAquisicao(LocalDate dataAquisicao) {
		DataAquisicao = dataAquisicao;
	}

	public String getValor() {
		return Valor;
	}

	public void setValor(String valor) {
		Valor = valor;
	}

	public LocalDate getDataValidade() {
		return DataValidade;
	}

	public void setDataValidade(LocalDate dataValidade) {
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