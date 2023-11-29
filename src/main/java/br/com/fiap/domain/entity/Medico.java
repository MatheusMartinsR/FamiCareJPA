package br.com.fiap.domain.entity;

import br.com.fiap.domain.entity.Familiar;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "TB_MEDICO")

public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_MEDICO")
    @Column(name = "ID_MEDICO")
    private Long id;

    @Column(name = "NOME_MEDICO")
    private String nome;

    @OneToOne
    @JoinColumn(name = "ID_ESPECIALIDADE")
    private Especialidade especialidade;

    public Medico() {
    }

    public Medico(Long id, String nome, Especialidade especialidade) {
        this.id = id;
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Long getId() {
        return id;
    }

    public Medico setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Medico setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public Medico setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
        return this;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", especialidade=" + especialidade +
                '}';
    }
}
