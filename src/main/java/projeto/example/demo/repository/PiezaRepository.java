package projeto.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import projeto.example.demo.model.Pieza;

public interface PiezaRepository extends JpaRepository<Pieza, Long>{
	
}