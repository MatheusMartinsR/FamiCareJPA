package br.com.fiap;

import br.com.fiap.domain.entity.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("oracle");
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();

            // Criando uma pessoa
            Pessoa pessoa = new Pessoa();
            pessoa.setNome("João");
            pessoa.setNascimento(LocalDate.now());
            em.persist(pessoa);

            // Criando uma pessoa física associada à pessoa anterior
            PessoaFisica pessoaFisica = new PessoaFisica();
            pessoaFisica.setCPF("12345678901");
            pessoaFisica.setSexo(Sexo.MASCULINO);
            pessoaFisica.setPessoa(pessoa);
            em.persist(pessoaFisica);

            // Criando um familiar associado à pessoa anterior
            Familiar familiar = new Familiar();
            familiar.setCpf("98765432109");
            familiar.setEmail("familiar@example.com");
            familiar.setPessoa(pessoa);
            em.persist(familiar);

            // Criando um exame médico associado ao familiar anterior
            ExameMedico exameMedico = new ExameMedico();
            exameMedico.setLaboratorial("Hemograma");
            exameMedico.setData(LocalDate.now());
            exameMedico.setFamiliar(familiar);
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
