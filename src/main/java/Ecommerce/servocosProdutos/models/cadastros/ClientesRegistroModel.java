package Ecommerce.servocosProdutos.models.cadastros;

import Ecommerce.servocosProdutos.models.feedbackColaboradores.ClientesFeedbackModel;
import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "clientesInformacoesBase", schema = "clientes")
public class ClientesRegistroModel extends ClientesFeedbackModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pessoaId", unique = true)
    private Long pessoaId;

    @Column(name = "nome", length = 200)
    private String nome;

    @Column(name = "cpf", nullable = false, unique = true, length = 14)
    private String cpf;

    @Column(name = "telefone", nullable = false, length = 20)
    private String telefone;

    @Column(name = "dataNascimento", unique = true)
    private LocalDate dataNascimento;

    @Column(nullable = false)
    private LocalDate dataRegistroSistema = LocalDate.now();

    @Column(name = "atualizadoEm")
    private LocalDate atualizadoEm = LocalDate.now();

    public void setDataRegistroSistema(LocalDate dataRegistroSistema) {
        this.dataRegistroSistema = dataRegistroSistema;
    }

    public LocalDate getAtualizadoEm() {
        return atualizadoEm;
    }

    public void setAtualizadoEm(LocalDate atualizadoEm) {
        this.atualizadoEm = atualizadoEm;
    }

    public Long getPessoaId() {
        return pessoaId;
    }

    public void setPessoaId(Long pessoaId) {
        this.pessoaId = pessoaId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataRegistroSistema() {
        return dataRegistroSistema;
    }
}