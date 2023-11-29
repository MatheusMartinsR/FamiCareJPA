package br.com.fiap.domain.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_ESPECIALIDADE_MEDICO")
public class Especialidade {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ESPECIALIDADE")
    @Column(name = "ID_ESPECIALIDADE")
    private Long id;

    @Column(name = "ESPECIALIDADE")
    private String especialidade;

    public Especialidade() {
    }

    public Especialidade(Long id, String especialidade) {
        this.id = id;
        this.especialidade = especialidade;
    }

    public Long getId() {
        return id;
    }

    public Especialidade setId(Long id) {
        this.id = id;
        return this;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public Especialidade setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
        return this;
    }

    @Override
    public String toString() {
        return "Especialidade{" +
                "id=" + id +
                ", especialidade='" + especialidade + '\'' +
                '}';
    }

}