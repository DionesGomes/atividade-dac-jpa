package br.edu.ifpb.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "PARTICIPANTES")
public class Participante implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(length = 150, nullable = false)
    private String nome;
    private String email;
    private String nomeCracha;
    private String instituicao;
    private String CPF;
    private String tipoUsuario;
    private String profissao;

    @OneToOne(cascade = CascadeType.ALL)
    private Contato contato;                // Relacionamento 1 para 1 (Unidirecional).
    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;              //Relacionamento 1 para 1 (unidirecional).

    @OneToMany(cascade = CascadeType.ALL)
    private List<Artigo> artigo;            //Relacionamento 1 para N (unidirecional).

    @OneToMany(cascade = CascadeType.ALL)
    private List<Inscricao> inscricaos;     //Relacionamento 1 para N (unidirecional).

    public Participante() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomeCracha() {
        return nomeCracha;
    }

    public void setNomeCracha(String nomeCracha) {
        this.nomeCracha = nomeCracha;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Artigo> getArtigo() {
        return artigo;
    }

    public void setArtigo(List<Artigo> artigo) {
        this.artigo = artigo;
    }

    public List<Inscricao> getInscricaos() {
        return inscricaos;
    }

    public void setInscricaos(List<Inscricao> inscricaos) {
        this.inscricaos = inscricaos;
    }
    
}
