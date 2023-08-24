package projeto.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import projeto.example.demo.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{
	
}