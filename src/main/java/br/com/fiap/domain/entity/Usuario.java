package br.com.fiap.domain.entity;



import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Table(name = "TB_USUARIO",
uniqueConstraints = {
        @UniqueConstraint(name = "UK_EMAIL_USUARIO", columnNames = "EMAIL_USUARIO")
})

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_USUARIO")
    @Column(name = "ID_USUARIO")
    private Long id;

    @Column(name = "NOME_USUARIO")
    private String nome;

    @Column(name = "EMAIL_USUARIO")
    private String email;

    @Column(name = "SENHA_USUARIO")
    private String senha;

    @Column(name = "CNPJ_USUARIO")
    private String cnpj;

    @Column(name = "CEP_USUARIO")
    private String cep;

    @Column(name = "RUA_USUARIO")
    private String rua;

    @Column(name = "TIPO_USUARIO")
    private String tipo;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Pessoa> enderecos;


    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private Set<ItemDeCompra> compras = new LinkedHashSet<>();

    public Long getId() {
        return id;
    }

    public Usuario setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Usuario setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Usuario setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getSenha() {
        return senha;
    }

    public Usuario setSenha(String senha) {
        this.senha = senha;
        return this;
    }

    public String getCnpj() {
        return cnpj;
    }

    public Usuario setCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    public String getCep() {
        return cep;
    }

    public Usuario setCep(String cep) {
        this.cep = cep;
        return this;
    }

    public String getRua() {
        return rua;
    }

    public Usuario setRua(String rua) {
        this.rua = rua;
        return this;
    }

    public String getTipo() {
        return tipo;
    }

    public Usuario setTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", cep='" + cep + '\'' +
                ", rua='" + rua + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
