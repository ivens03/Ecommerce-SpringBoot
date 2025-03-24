package Ecommerce.servocosProdutos.models.cadastros;

import jakarta.persistence.*;

import java.io.Serializable;

@MappedSuperclass
public abstract class EnderecosModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "enderecoId", unique = true)
    private Long enderecoId;

    @Column(name = "nomeDestinatario", unique = true, nullable = false, length = 30)
    private String nomeDestinatario;

    @Column(name = "numeroDestinatario", unique = true, length = 11)
    private String numeroDestinatario;

    @Column(name = "ruaDestinatario", unique = true, nullable = false, length = 100)
    private String ruaDestinatario;

    @Column(name = "complementoDestinatario", nullable = false, length = 300)
    private String complementoDestinatario;

    @Column(name = "cep", nullable = false, length = 8)
    private String cep;

    public EnderecosModel() {}

    public EnderecosModel(
            Long enderecoId,
            String nomeDestinatario,
            String numeroDestinatario,
            String ruaDestinatario,
            String complementoDestinatario,
            String cep) {
        this.enderecoId = enderecoId;
        this.nomeDestinatario = nomeDestinatario;
        this.numeroDestinatario = numeroDestinatario;
        this.ruaDestinatario = ruaDestinatario;
        this.complementoDestinatario = complementoDestinatario;
        this.cep = cep;
    }

    // Getters e Setters

    public Long getEnderecoId() {
        return enderecoId;
    }

    public void setEnderecoId(Long enderecoId) {
        this.enderecoId = enderecoId;
    }

    public String getNomeDestinatario() {
        return nomeDestinatario;
    }

    public void setNomeDestinatario(String nomeDestinatario) {
        this.nomeDestinatario = nomeDestinatario;
    }

    public String getNumeroDestinatario() {
        return numeroDestinatario;
    }

    public void setNumeroDestinatario(String numeroDestinatario) {
        this.numeroDestinatario = numeroDestinatario;
    }

    public String getRuaDestinatario() {
        return ruaDestinatario;
    }

    public void setRuaDestinatario(String ruaDestinatario) {
        this.ruaDestinatario = ruaDestinatario;
    }

    public String getComplementoDestinatario() {
        return complementoDestinatario;
    }

    public void setComplementoDestinatario(String complementoDestinatario) {
        this.complementoDestinatario = complementoDestinatario;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}

