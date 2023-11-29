package br.com.fiap.domain.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_BAIRRO")

public class Bairro {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_BAIRRO")
    @Column(name = "ID_BAIRRO")
    private Long id;

    @Column(name = "NOME_BAIRRO")
    private String nome;

    @ManyToOne
    @JoinColumn(name = "ID_CIDADE")
    private Cidade cidade;

    public Bairro() {
    }

    public Bairro(Long id, String nome, Cidade cidade) {
        this.id = id;
        this.nome = nome;
        this.cidade = cidade;
    }

    public Long getId() {
        return id;
    }

    public Bairro setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Bairro setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public Bairro setCidade(Cidade cidade) {
        this.cidade = cidade;
        return this;
    }

    @Override
    public String toString() {
        return "Bairro{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cidade=" + cidade +
                '}';
    }
}
