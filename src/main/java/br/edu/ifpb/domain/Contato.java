package br.edu.ifpb.domain;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "CONTATOS")
@SequenceGenerator(name = "USU_SEQ", sequenceName = "USUARIO_SEQ", initialValue = 1, allocationSize = 1)
public class Contato implements Serializable {

    private static final long serialVersionUID = -4023522856316087762L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USU_SEQ")
    private long id;
    private String telefoneResidencial;
    private String telefoneComercial;
    private String telefoneCelular;

    public Contato() {

    }

    public void setTelefoneResidencial(String telefoneResidencial) {
        this.telefoneResidencial = telefoneResidencial;
    }

    public void setTelefoneComercial(String telefoneComercial) {
        this.telefoneComercial = telefoneComercial;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    public String getTelefoneResidencial() {
        return telefoneResidencial;
    }

    public String getTelefoneComercial() {
        return telefoneComercial;
    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "telefoneResidencial='" + telefoneResidencial + '\'' +
                ", telefoneComercial='" + telefoneComercial + '\'' +
                ", telefoneCelular='" + telefoneCelular + '\'' +
                '}';
    }

}
