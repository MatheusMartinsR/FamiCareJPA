package br.com.fiap.domain.entity;


import jakarta.persistence.*;
import org.checkerframework.checker.units.qual.C;

@Table(name = "TB_MARCA")

public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_MARCA")
    @Column(name = "ID_MARCA")
    private Long id;

    @Column(name = "MARCA_PRODUTO")
    private String marca;

    @ManyToOne
    @JoinColumn(name = "ID_USUARIO", nullable = false)
    private Usuario usuario;

    public Long getId() {
        return id;
    }

    public Marca setId(Long id) {
        this.id = id;
        return this;
    }

    public String getMarca() {
        return marca;
    }

    public Marca setMarca(String marca) {
        this.marca = marca;
        return this;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Marca setUsuario(Usuario usuario) {
        this.usuario = usuario;
        return this;
    }

    @Override
    public String toString() {
        return "Marca{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", usuario=" + usuario +
                '}';
    }
}