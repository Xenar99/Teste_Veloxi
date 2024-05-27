package br.com.skeleton.business.repository;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import br.com.skeleton.business.entity.Entity_Equipamentos;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class CamadaPersistencia {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DeggaPersistence");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        // Criando uma instância de DAO_Equipamentos com EntityManager
        DAO_Equipamentos daoEquipamentos = new DAO_Equipamentos(em);

        // Buscando as informações do banco
        List<Entity_Equipamentos> listaDeEquipamentos = daoEquipamentos.pesquisar("");
        System.out.println(listaDeEquipamentos);

        // Criando um Equipamento
        Entity_Equipamentos equipamento = new Entity_Equipamentos();
        equipamento.setEquipamento("Multímetro 2");
        equipamento.setDescricao("Multímetro 34461A Keysight");
        //equipamento.setDataAquisicao(Date(2024, 5, 27));
        equipamento.setValor("10000");
        //equipamento.setDataValidade(Date(2025, 5, 27)); // Corrigindo o método de configuração da data

        // Salvando o Equipamento
        daoEquipamentos.Salvar(equipamento);

        em.getTransaction().commit();

        // Verificando se o teste funcionou
        List<Entity_Equipamentos> listaDeEquipamentos2 = daoEquipamentos.pesquisar("");
        System.out.println(listaDeEquipamentos2);

        
        em.close();
        emf.close();
    }
}
