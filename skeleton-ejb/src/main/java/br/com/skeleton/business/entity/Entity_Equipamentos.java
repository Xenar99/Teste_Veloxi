package br.com.skeleton.business.entity;

import java.util.Date;
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
    @Column(name = "id")
    protected Long id;
    
    @Column(name = "Equipamento", nullable = false, length = 80)
    protected String equipamento;
    
    @Column(name = "Descricao", nullable = false, length = 100)
    protected String descricao;
    
    @Column(name = "DataAquisicao")
    protected Date dataAquisicao;
    
    @Column(name = "Valor", nullable = false, length = 20)
    protected String valor;
    
    @Column(name = "DataValidade")
    protected Date dataValidade;

    public Entity_Equipamentos() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(Date dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
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
        return Objects.equals(id, other.id);
    }

    @Override
    public String toString() {
        return "Entity_Equipamentos [id=" + id + "]";
    }
}
