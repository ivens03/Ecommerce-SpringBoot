package Ecommerce.servocosProdutos.models.servicosProdutos;

import Ecommerce.servocosProdutos.enums.IndentificadorProdServEnum;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "servicos", schema = "vendas")
public class ServicosModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "servicoId", nullable = false, unique = true)
    private Long produtoId;

    @Column(name = "sobreServico", nullable = false, length = 1000)
    private String sobreItem;

    @Column(name = "fichaTecPrestador", nullable = false, length = 200)
    private String fichaTecPrestador;

    @Column(name = "categoriaServico", nullable = false, unique = true)
    private String categoriaServico;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, unique = true)
    private IndentificadorProdServEnum identificadorProdServ;

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

    public String getFichaTecPrestador() {
        return fichaTecPrestador;
    }

    public void setFichaTecPrestador(String fichaTecPrestador) {
        this.fichaTecPrestador = fichaTecPrestador;
    }

    public String getCategoriaServico() {
        return categoriaServico;
    }

    public void setCategoriaServico(String categoriaServico) {
        this.categoriaServico = categoriaServico;
    }

    public IndentificadorProdServEnum getIdentificadorProdServ() {
        return identificadorProdServ;
    }

    public void setIdentificadorProdServ(IndentificadorProdServEnum identificadorProdServ) {
        this.identificadorProdServ = identificadorProdServ;
    }
}
