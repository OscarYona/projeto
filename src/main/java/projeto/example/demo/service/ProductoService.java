package projeto.example.demo.service;

import java.util.List;

import projeto.example.demo.model.Producto;

public interface ProductoService {
	List <Producto> findAll();
	Producto findById(Long Id);
	Producto save(Producto peca);

}
