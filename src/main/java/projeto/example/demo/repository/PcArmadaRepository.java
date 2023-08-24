package projeto.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import projeto.example.demo.model.PcArmada;

public interface PcArmadaRepository extends JpaRepository<PcArmada, Long>{
	
}
