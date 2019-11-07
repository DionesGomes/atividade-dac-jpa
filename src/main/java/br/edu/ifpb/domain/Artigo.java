package br.edu.ifpb.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "ARTIGOS")
public class Artigo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(length = 200, nullable = false)
    private String titulo;
    private String orientador;
    private String coautores;
    private String modalidade;
    @Temporal(TemporalType.DATE)
    private Date dataSubmissao;
    private String urlDownload;

    @ManyToOne
    private Participante participante; //Relacionamento N para 1.

    public Artigo() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getOrientador() {
        return orientador;
    }

    public void setOrientador(String orientador) {
        this.orientador = orientador;
    }

    public String getCoautores() {
        return coautores;
    }

    public void setCoautores(String coautores) {
        this.coautores = coautores;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public Date getDataSubmissao() {
        return dataSubmissao;
    }

    public void setDataSubmissao(Date dataSubmissao) {
        this.dataSubmissao = dataSubmissao;
    }

    public String getUrlDownload() {
        return urlDownload;
    }

    public void setUrlDownload(String urlDownload) {
        this.urlDownload = urlDownload;
    }

    @Override
    public String toString() {
        return "Artigo{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", orientador='" + orientador + '\'' +
                ", coautores='" + coautores + '\'' +
                ", modalidade='" + modalidade + '\'' +
                ", dataSubmissao=" + dataSubmissao +
                ", urlDownload='" + urlDownload + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artigo artigo = (Artigo) o;
        return Objects.equals(id, artigo.id) &&
                Objects.equals(titulo, artigo.titulo) &&
                Objects.equals(orientador, artigo.orientador) &&
                Objects.equals(coautores, artigo.coautores) &&
                Objects.equals(modalidade, artigo.modalidade) &&
                Objects.equals(dataSubmissao, artigo.dataSubmissao) &&
                Objects.equals(urlDownload, artigo.urlDownload);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titulo, orientador, coautores, modalidade, dataSubmissao, urlDownload);
    }
}
