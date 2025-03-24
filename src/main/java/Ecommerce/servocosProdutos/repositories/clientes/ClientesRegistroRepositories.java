package Ecommerce.servocosProdutos.repositories.clientes;

import Ecommerce.servocosProdutos.models.cadastros.ClientesRegistroModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesRegistroRepositories extends JpaRepository<ClientesRegistroModel, Long> {
}
