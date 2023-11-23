package br.com.fiap.domain.entity;

import jakarta.persistence.*;

@Table(name = "TB_FAMILIAR")

public class Familiar {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ENDERECO_FORNECEDOR")
    @Column(name = "ID_FAMILIAR")
    private Long id;

    @Column(name = "CPF_FAMILIAR")
    private String cpf;

    @Column(name = "EMAIL_FAMILIAR")
    private String email;

    @ManyToOne
    @JoinColumn(name = "ID_PESSOA")
    private Pessoa pessoa;

    public Long getId() {
        return id;
    }

    public Familiar setId(Long id) {
        this.id = id;
        return this;
    }

    public String getCpf() {
        return cpf;
    }

    public Familiar setCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Familiar setEmail(String email) {
        this.email = email;
        return this;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public Familiar setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
        return this;
    }

    @Override
    public String toString() {
        return "Familiar{" +
                "id=" + id +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", pessoa=" + pessoa +
                '}';
    }
}