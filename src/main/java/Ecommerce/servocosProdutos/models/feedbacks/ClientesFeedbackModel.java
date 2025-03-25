package Ecommerce.servocosProdutos.models.feedbacks;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

import java.io.Serializable;

@MappedSuperclass
public abstract class ClientesFeedbackModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "feedbackClientes", length = 1000)
    private String feedbackClientes;

}
