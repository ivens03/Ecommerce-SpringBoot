package Ecommerce.servocosProdutos.models.cadastros;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "enderecoCasa", schema = "enderecos")
public class EnderecoCasaModel extends EnderecosModel {

    @Column(name = "Casa", unique = true)
    private Boolean casa;

    @Column(name = "numeroCasa", unique = true)
    private Integer numeroCasa;

    public Boolean getCasa() {
        return casa;
    }

    public void setCasa(Boolean casa) {
        this.casa = casa;
    }

    public Integer getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(Integer numeroCasa) {
        this.numeroCasa = numeroCasa;
    }
}
