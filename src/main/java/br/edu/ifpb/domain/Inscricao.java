package br.edu.ifpb.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "INSCRICOES")
public class Inscricao implements Serializable {

    public enum TipoEvento { CONGRESSO, SIMPOSIO };

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String status;
    @Temporal(TemporalType.DATE)
    private Date dataInscricao;
    private Double preco;
    @Enumerated(EnumType.STRING)
    private TipoEvento tipoEvento;
    private String tipoParticipacao;

    @ManyToOne
    private Participante participante; // Relacionamento N para 1.

    public Inscricao() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDataInscricao() {
        return dataInscricao;
    }

    public void setDataInscricao(Date dataInscricao) {
        this.dataInscricao = dataInscricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public String getTipoParticipacao() {
        return tipoParticipacao;
    }

    public void setTipoParticipacao(String tipoParticipacao) {
        this.tipoParticipacao = tipoParticipacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inscricao inscricao = (Inscricao) o;
        return Objects.equals(id, inscricao.id) &&
                Objects.equals(status, inscricao.status) &&
                Objects.equals(dataInscricao, inscricao.dataInscricao) &&
                Objects.equals(preco, inscricao.preco) &&
                Objects.equals(tipoEvento, inscricao.tipoEvento) &&
                Objects.equals(tipoParticipacao, inscricao.tipoParticipacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, dataInscricao, preco, tipoEvento, tipoParticipacao);
    }

    @Override
    public String toString() {
        return "Inscricao{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", dataInscricao=" + dataInscricao +
                ", preco=" + preco +
                ", tipoEvento='" + tipoEvento + '\'' +
                ", tipoParticipacao='" + tipoParticipacao + '\'' +
                '}';
    }
}
