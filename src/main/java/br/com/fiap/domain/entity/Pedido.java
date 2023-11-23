package br.com.fiap.domain.entity;
import jakarta.persistence.*;

import java.util.Date;

@Table(name = "TB_PEDIDO")

public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PEDIDO")
    @Column(name = "ID_PEDIDO")
    private Long id;

    @Column(name = "NOME_PEDIDO")
    private String nome;

    @Column(name = "DESC_PEDIDO")
    private String descricao;

    @Column(name = "DATA_PEDIDO")
    private Date data;

    @Column(name = "PRECO_PEDIDO")
    private String preco;

    @Column(name = "PEDIDO_ACEITO")
    private boolean pedidoAceito;

    @ManyToOne
    @JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID_USUARIO")
    private Usuario usuario;

    public Long getId() {
        return id;
    }

    public Pedido setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Pedido setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public Pedido setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public Date getData() {
        return data;
    }

    public Pedido setData(Date data) {
        this.data = data;
        return this;
    }

    public String getPreco() {
        return preco;
    }

    public Pedido setPreco(String preco) {
        this.preco = preco;
        return this;
    }

    public boolean isPedidoAceito() {
        return pedidoAceito;
    }

    public Pedido setPedidoAceito(boolean pedidoAceito) {
        this.pedidoAceito = pedidoAceito;
        return this;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Pedido setUsuario(Usuario usuario) {
        this.usuario = usuario;
        return this;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                ", preco='" + preco + '\'' +
                ", pedidoAceito=" + pedidoAceito +
                ", usuario=" + usuario +
                '}';
    }
}
