package br.com.fiap.domain.entity;

public enum Sexo {

    FEMININO(0, "Feminino", 'F'), MASCULINO(1, "Masculino", 'M');

    private int id;
    private String nome;
    private String sigla;


    Sexo(int id, String nome, Character sigla) {
        this.id = id;
        this.nome = nome;
        this.sigla = String.valueOf(sigla);
    }

    public int getId() {
        return id;
    }

    public Sexo setId(int id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Sexo setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getSigla() {
        return sigla;
    }

    public Sexo setSigla(Character sigla) {
        this.sigla = String.valueOf(sigla);
        return this;
    }

    @Override
    public String toString() {
        return String.valueOf(sigla);
    }
}






