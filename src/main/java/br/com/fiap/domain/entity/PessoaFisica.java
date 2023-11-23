package br.com.fiap.domain.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "TB_PESSOA_FISICA",
        uniqueConstraints = {
                @UniqueConstraint(name = "UK_CPF", columnNames = "NR_CPF")
        })
public class PessoaFisica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PESSOA_FISICA")
    private Long id;

    @Column(name = "NR_CPF")
    private String CPF;

    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "TB_FAMILIARES",
            joinColumns = {
                    @JoinColumn(
                            name = "ID_PESSOA",
                            referencedColumnName = "ID_PESSOA",
                            foreignKey = @ForeignKey(name = "FK_PESSOA")
                    )
            },
            inverseJoinColumns = {
                    @JoinColumn(
                            name = "ID_FAMILIAR",
                            referencedColumnName = "ID_PESSOA",
                            foreignKey = @ForeignKey(name = "FK_FAMILIAR")
                    )
            }
    )
    private Set<PessoaFisica> familiares = new LinkedHashSet<>();


    public PessoaFisica() {
    }


    public PessoaFisica(Long id, String CPF, Sexo sexo, Set<PessoaFisica> familiares) {
        this.id = id;
        this.CPF = CPF;
        this.sexo = sexo;
        this.familiares = familiares;
    }


    public PessoaFisica addFamiliar(PessoaFisica familiar) {
        if (familiar.equals(this)) throw new RuntimeException("Não é permitido adicionar a si mesmo como familiar.");
        this.familiares.add(familiar);
        return this;
    }

    public PessoaFisica removeFamiliar(PessoaFisica familiar) {
        this.familiares.remove(familiar);
        return this;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Set<PessoaFisica> getFamiliares() {
        return familiares;
    }

    public void setFamiliares(Set<PessoaFisica> familiares) {
        this.familiares = familiares;
    }
}
