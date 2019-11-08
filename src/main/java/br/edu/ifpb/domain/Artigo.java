package br.edu.ifpb.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "ARTIGOS")
public class Artigo implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;
    @Column(length = 200, nullable = false)
    private String titulo;
    private String orientador;
    private String coautores;
    private String modalidade;
    @Temporal(TemporalType.DATE)
    private Date dataSubmissao;
    private String urlDownload;

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

}
