package projeto.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import projeto.example.demo.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
}
