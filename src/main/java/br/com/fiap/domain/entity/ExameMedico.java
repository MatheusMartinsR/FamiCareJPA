package br.com.fiap.domain.entity;

import br.com.fiap.domain.entity.Familiar;
import jakarta.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "TB_EXAME_MEDICO")
public class ExameMedico {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_EXAME_MEDICO")
    @Column(name = "ID_EXAME")
    private Long id;

    @Column(name = "LABORATORIAL_EXAME")
    private String laboratorial;

    @Column(name = "DATA_EXAME")
    private LocalDate data;

    @ManyToOne
    @JoinColumn(name = "ID_FAMILIAR")
    private Familiar familiar;

    public Long getId() {
        return id;
    }

    public ExameMedico setId(Long id) {
        this.id = id;
        return this;
    }

    public String getLaboratorial() {
        return laboratorial;
    }

    public ExameMedico setLaboratorial(String laboratorial) {
        this.laboratorial = laboratorial;
        return this;
    }

    public LocalDate getData() {
        return data;
    }

    public ExameMedico setData(LocalDate data) {
        this.data = data;
        return this;
    }

    public Familiar getFamiliar() {
        return familiar;
    }

    public ExameMedico setFamiliar(Familiar familiar) {
        this.familiar = familiar;
        return this;
    }

    @Override
    public String toString() {
        return "ExameMedico{" +
                "id=" + id +
                ", laboratorial='" + laboratorial + '\'' +
                ", data=" + data +
                ", familiar=" + familiar +
                '}';
    }
}
