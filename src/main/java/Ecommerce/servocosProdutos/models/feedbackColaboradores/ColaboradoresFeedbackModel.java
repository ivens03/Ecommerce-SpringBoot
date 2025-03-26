package Ecommerce.servocosProdutos.models.feedbackColaboradores;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
public abstract class ColaboradoresFeedbackModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "feedbackColaboradores", length = 1000)
    private String feedbackColaboradores;
}
