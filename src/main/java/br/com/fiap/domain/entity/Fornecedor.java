package br.com.fiap.domain.entity;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Table(name = "TB_FORNECEDOR",
uniqueConstraints = {
        @UniqueConstraint(name = "UK_EMAIL_FORNECEDOR", columnNames = "EMAIL_FORNECEDOR")
})
public class Fornecedor
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_FORNECEDOR")
    @Column(name = "ID_FORNECEDOR")
    private Long id;

    @Column(name = "NOME_FORNECEDOR")
    private String nome;

    @Column(name = "EMAIL_FORNECEDOR")
    private String email;

    @Column(name = "SENHA_FORNECEDOR")
    private String senha;

    @OneToMany(mappedBy = "fornecedor", cascade = CascadeType.ALL)
    private Set<Produto> produtos = new LinkedHashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Set<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(Set<Produto> produtos) {
        this.produtos = produtos;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Fornecedor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", produtos=" + produtos +
                '}';
    }
}








