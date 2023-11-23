package br.com.fiap;

import br.com.fiap.domain.entity.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("oracle");
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();

            // Criando instâncias das classes fornecidas
            Pessoa pessoa = new Pessoa();
            pessoa.setNome("João");
            pessoa.setNascimento(LocalDate.now());

            PessoaFisica pessoaFisica = new PessoaFisica();
            pessoaFisica.setCPF("12345678901");
            pessoaFisica.setSexo(Sexo.MASCULINO);

            Familiar familiar = new Familiar();
            familiar.setCpf("98765432109");
            familiar.setEmail("familiar@example.com");
            familiar.setPessoa(pessoa);

            ExameMedico exameMedico = new ExameMedico();
            exameMedico.setLaboratorial("Hemograma");
            exameMedico.setData(LocalDate.now());
            exameMedico.setFamiliar(familiar);

            // Persistindo as entidades
            em.persist(pessoa);
            em.persist(pessoaFisica);
            em.persist(familiar);
            em.persist(exameMedico);

            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    }
}
