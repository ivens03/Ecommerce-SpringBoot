package Ecommerce.servocosProdutos.models.servicosProdutos;

import Ecommerce.servocosProdutos.enums.IndentificadorProdServEnum;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "produtos", schema = "vendas")
public class ProdutosModel extends FeedbackUsuariosModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "produtoId", nullable = false, unique = true)
    private Long produtoId;

    @Column(name = "sobreItem", nullable = false, length = 1000)
    private String sobreItem;

    @Column(name = "fichaTec", nullable = false, length = 200)
    private String fichaTec;

    @Column(name = "categoriaProduto", nullable = false, unique = true)
    private String categoriaProduto;

    public Long getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(Long produtoId) {
        this.produtoId = produtoId;
    }

    public String getSobreItem() {
        return sobreItem;
    }

    public void setSobreItem(String sobreItem) {
        this.sobreItem = sobreItem;
    }

    public String getFichaTec() {
        return fichaTec;
    }

    public void setFichaTec(String fichaTec) {
        this.fichaTec = fichaTec;
    }

    public String getCategoriaProduto() {
        return categoriaProduto;
    }

    public void setCategoriaProduto(String categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }

    public IndentificadorProdServEnum getIdentificadorProdServ() {
        return identificadorProdServ;
    }

    public void setIdentificadorProdServ(IndentificadorProdServEnum identificadorProdServ) {
        this.identificadorProdServ = identificadorProdServ;
    }

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, unique = true)
    private IndentificadorProdServEnum identificadorProdServ;
}
