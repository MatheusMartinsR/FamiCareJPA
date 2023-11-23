package br.com.fiap.domain.entity;


import jakarta.persistence.*;
import org.checkerframework.checker.units.qual.C;

@Table(name = "TB_MODELO")

public class Modelo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_MODELO")
    @Column(name = "ID_MODELO")
    private Long id;

    @Column(name = "NOME_MODELO")
    private String modelo;

    @ManyToOne
    @JoinColumn(name = "ID_PRODUTO", nullable = false)
    private Produto produto;

    public Long getId() {
        return id;
    }

    public Modelo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getModelo() {
        return modelo;
    }

    public Modelo setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public Produto getProduto() {
        return produto;
    }

    public Modelo setProduto(Produto produto) {
        this.produto = produto;
        return this;
    }

    @Override
    public String toString() {
        return "Modelo{" +
                "id=" + id +
                ", modelo='" + modelo + '\'' +
                ", produto=" + produto +
                '}';
    }
}