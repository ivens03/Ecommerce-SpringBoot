package Ecommerce.servocosProdutos.models.seguranca;

import Ecommerce.servocosProdutos.models.cadastros.ClientesRegistroModel;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "usuarios", schema = "seguranca")
public class SegurancaUsuariosModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuario_id")
    private Long usuarioId;

    @Column(name = "nome", length = 200)
    private String nome;

    @Column(name = "login", length = 255, nullable = false, unique = true)
    private String login;

    @Column(name = "senha", length = 255, nullable = false)
    private String senha;

    @Column(name = "email", length = 255)
    private String email;

    @Column(name = "ativo", nullable = false)
    private Boolean ativo = true;

    @Column(name = "atualizadoEm")
    private LocalDateTime atualizadoEm;

    @ManyToOne
    @JoinColumn(name = "atualizadoPor")
    private ClientesRegistroModel clientesRegistroModel;

}
