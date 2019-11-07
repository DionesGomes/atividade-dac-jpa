package br.edu.ifpb.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

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

    @OneToOne
    private Contato contato; // Relacionamento 1 para 1.
    @OneToOne
    private Endereco endereco; //Relacionamento 1 para 1.


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

    @Override
    public String toString() {
        return "Participante{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", nomeCracha='" + nomeCracha + '\'' +
                ", instituicao='" + instituicao + '\'' +
                ", CPF='" + CPF + '\'' +
                ", tipoUsuario='" + tipoUsuario + '\'' +
                ", profissao='" + profissao + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Participante that = (Participante) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(nome, that.nome) &&
                Objects.equals(email, that.email) &&
                Objects.equals(nomeCracha, that.nomeCracha) &&
                Objects.equals(instituicao, that.instituicao) &&
                Objects.equals(CPF, that.CPF) &&
                Objects.equals(tipoUsuario, that.tipoUsuario) &&
                Objects.equals(profissao, that.profissao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, email, nomeCracha, instituicao, CPF, tipoUsuario, profissao);
    }
}
