package projeto.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import projeto.example.demo.model.TipoPieza;

public interface TipoPiezaRepository extends JpaRepository<TipoPieza, Long>{
	
}