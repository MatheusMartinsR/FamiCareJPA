package br.com.fiap.domain.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_ENDERECO")

public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ENDERECO")
    @Column(name = "ID_ENDERECO")
    private Long id;

    @Column(name = "LOGRADOURO")
    private String logradouro;

    @Column(name = "NUMERO_ENDERECO")
    private String numero;

    @Column(name = "CEP")
    private String cep;

    @ManyToOne
    @JoinColumn(name = "ID_BAIRRO")
    private Bairro bairro;

    public Endereco() {
    }

    public Endereco(Long id, String logradouro, String numero, String cep, Bairro bairro) {
        this.id = id;
        this.logradouro = logradouro;
        this.numero = numero;
        this.cep = cep;
        this.bairro = bairro;
    }

    public Long getId() {
        return id;
    }

    public Endereco setId(Long id) {
        this.id = id;
        return this;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public Endereco setLogradouro(String logradouro) {
        this.logradouro = logradouro;
        return this;
    }

    public String getNumero() {
        return numero;
    }

    public Endereco setNumero(String numero) {
        this.numero = numero;
        return this;
    }

    public String getCep() {
        return cep;
    }

    public Endereco setCep(String cep) {
        this.cep = cep;
        return this;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public Endereco setBairro(Bairro bairro) {
        this.bairro = bairro;
        return this;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "id=" + id +
                ", logradouro='" + logradouro + '\'' +
                ", numero='" + numero + '\'' +
                ", cep='" + cep + '\'' +
                ", bairro=" + bairro +
                '}';
    }
}
