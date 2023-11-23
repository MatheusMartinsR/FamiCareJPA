package br.com.fiap.domain.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "TB_RECEITA_MEDICA")

public class ReceitaMedica {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_MARCA")
    @Column(name = "ID_RECEITA")
    private Long id;

    @Column(name = "RECEITA_TEMPORARIA")
    private String receita_temporaria;

    @Column(name = "RECEITA_CONTINUA")
    private String receita_continua;

    @ManyToOne
    @JoinColumn(name = "ID_FAMILIAR")
    private Familiar familiar;

    public Long getId() {
        return id;
    }

    public ReceitaMedica setId(Long id) {
        this.id = id;
        return this;
    }

    public String getReceita_temporaria() {
        return receita_temporaria;
    }

    public ReceitaMedica setReceita_temporaria(String receita_temporaria) {
        this.receita_temporaria = receita_temporaria;
        return this;
    }

    public String getReceita_continua() {
        return receita_continua;
    }

    public ReceitaMedica setReceita_continua(String receita_continua) {
        this.receita_continua = receita_continua;
        return this;
    }

    public Familiar getFamiliar() {
        return familiar;
    }

    public ReceitaMedica setFamiliar(Familiar familiar) {
        this.familiar = familiar;
        return this;
    }

    @Override
    public String toString() {
        return "ReceitaMedica{" +
                "id=" + id +
                ", receita_temporaria='" + receita_temporaria + '\'' +
                ", receita_continua='" + receita_continua + '\'' +
                ", familiar=" + familiar +
                '}';
    }
}