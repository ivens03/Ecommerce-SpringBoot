package Ecommerce.servocosProdutos.models.cadastros;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "enderecoCondominio", schema = "enderecos")
public class EnderecoCondominioModel extends EnderecosModel {

    @Column(name = "nomeCondominio", unique = true, length = 35)
    private String nomeCondominio;

    @Column(name = "numeroBlocoCondominio", unique = true)
    private Integer blocoCondominio;

    @Column(name = "numeroApartamentoCondominio", unique = true)
    private Integer apartamentoCondominio;

    public String getNomeCondominio() {
        return nomeCondominio;
    }

    public void setNomeCondominio(String nomeCondominio) {
        this.nomeCondominio = nomeCondominio;
    }

    public Integer getBlocoCondominio() {
        return blocoCondominio;
    }

    public void setBlocoCondominio(Integer blocoCondominio) {
        this.blocoCondominio = blocoCondominio;
    }

    public Integer getApartamentoCondominio() {
        return apartamentoCondominio;
    }

    public void setApartamentoCondominio(Integer apartamentoCondominio) {
        this.apartamentoCondominio = apartamentoCondominio;
    }
}
