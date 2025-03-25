package Ecommerce.servocosProdutos.models.cadastros;

import Ecommerce.servocosProdutos.enums.ServicosCategoriasEnum;
import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "servicosCategorias", schema = "categoria")
public class ServicosCategoriaModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "categoriaServicosId", unique = true, nullable = false)
    private Long categoriaServicosId;

    @Column(name = "TipoServico", unique = true, nullable = false, length = 50)
    private String tipoServico;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ServicosCategoriasEnum categoriaServicosCategoriasEnum;

    public Long getCategoriaServicosId() {
        return categoriaServicosId;
    }

    public void setCategoriaServicosId(Long categoriaServicosId) {
        this.categoriaServicosId = categoriaServicosId;
    }

    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    public ServicosCategoriasEnum getCategoriaServicosCategoriasEnum() {
        return categoriaServicosCategoriasEnum;
    }

    public void setCategoriaServicosCategoriasEnum(ServicosCategoriasEnum categoriaServicosCategoriasEnum) {
        this.categoriaServicosCategoriasEnum = categoriaServicosCategoriasEnum;
    }
}
