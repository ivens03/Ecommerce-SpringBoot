package Ecommerce.servocosProdutos.models.servicosProdutos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "feedbackUsuarios", schema = "vendas")
public class FeedbackUsuariosModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "feedbackUsuarios", length = 1000)
    private String feedbackUsuarios;

    @Column(name = "notasUsuarios")
    private Integer nota;
    @Id
    private Long id;

    public String getFeedbackUsuarios() {
        return feedbackUsuarios;
    }

    public void setFeedbackUsuarios(String feedbackUsuarios) {
        this.feedbackUsuarios = feedbackUsuarios;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public Integer getMediaNotasUsuarios() {
        return mediaNotasUsuarios;
    }

    public void setMediaNotasUsuarios(Integer mediaNotasUsuarios) {
        this.mediaNotasUsuarios = mediaNotasUsuarios;
    }

    @Column(name = "mediaNotasUsuarios")
    private Integer mediaNotasUsuarios;
}
