package projeto.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import projeto.example.demo.model.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Long>{
	
}