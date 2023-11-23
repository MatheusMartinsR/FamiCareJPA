package br.com.fiap.domain.entity;



import jakarta.persistence.*;

@Table(name = "TB_ItemDeCompra")

public class ItemDeCompra {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_DATA_COMPRA")
    @Column(name = "ID_COMPRA")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_USUARIO", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "ID_PRODUTO", nullable = false)
    private Produto produto;

    @Column(name = "ITEM_COMPRA")
    private String item;

    public Long getId() {
        return id;
    }

    public ItemDeCompra setId(Long id) {
        this.id = id;
        return this;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public ItemDeCompra setUsuario(Usuario usuario) {
        this.usuario = usuario;
        return this;
    }

    public Produto getProduto() {
        return produto;
    }

    public ItemDeCompra setProduto(Produto produto) {
        this.produto = produto;
        return this;
    }

    public String getItem() {
        return item;
    }

    public ItemDeCompra setItem(String item) {
        this.item = item;
        return this;
    }

    @Override
    public String toString() {
        return "DataDeCompra{" +
                "id=" + id +
                ", usuario=" + usuario +
                ", produto=" + produto +
                ", item='" + item + '\'' +
                '}';
    }
}



