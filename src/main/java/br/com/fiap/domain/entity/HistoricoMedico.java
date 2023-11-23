package br.com.fiap.domain.entity;

import jakarta.persistence.*;

@Table(name = "TB_HISTORICO_MEDICO")
public class HistoricoMedico
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_FORNECEDOR")
    @Column(name = "ID_HISTORICO")
    private Long id;

    @Column(name = "HISTORICO")
    private String historico;

    @Column(name = "PATOLOGIA")
    private String patologia;

    @Column(name = "TRATAMENTO")
    private String tratamento;

    @Column(name = "ALERGIA")
    private String alergia;

    @Column(name = "HISTORICO_FAMILIAR")
    private String historico_familiar;

    @ManyToOne
    @JoinColumn(name = "ID_FAMILIAR")
    private Familiar familiar;

    public Long getId() {
        return id;
    }

    public HistoricoMedico setId(Long id) {
        this.id = id;
        return this;
    }

    public String getHistorico() {
        return historico;
    }

    public HistoricoMedico setHistorico(String historico) {
        this.historico = historico;
        return this;
    }

    public String getPatologia() {
        return patologia;
    }

    public HistoricoMedico setPatologia(String patologia) {
        this.patologia = patologia;
        return this;
    }

    public String getTratamento() {
        return tratamento;
    }

    public HistoricoMedico setTratamento(String tratamento) {
        this.tratamento = tratamento;
        return this;
    }

    public String getAlergia() {
        return alergia;
    }

    public HistoricoMedico setAlergia(String alergia) {
        this.alergia = alergia;
        return this;
    }

    public String getHistorico_familiar() {
        return historico_familiar;
    }

    public HistoricoMedico setHistorico_familiar(String historico_familiar) {
        this.historico_familiar = historico_familiar;
        return this;
    }

    public Familiar getFamiliar() {
        return familiar;
    }

    public HistoricoMedico setFamiliar(Familiar familiar) {
        this.familiar = familiar;
        return this;
    }

    @Override
    public String toString() {
        return "Historico_medico{" +
                "id=" + id +
                ", historico='" + historico + '\'' +
                ", patologia='" + patologia + '\'' +
                ", tratamento='" + tratamento + '\'' +
                ", alergia='" + alergia + '\'' +
                ", historico_familiar='" + historico_familiar + '\'' +
                ", familiar=" + familiar +
                '}';
    }
}








