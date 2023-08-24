package projeto.example.demo.serviceImplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import projeto.example.demo.model.Producto;
import projeto.example.demo.repository.ProductoRepository;
import projeto.example.demo.service.ProductoService;

public class ProductoServiceImplement implements ProductoService{

	@Autowired
	ProductoRepository productoRepository;
	
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return productoRepository.findAll();
	}

	
	public Producto findById(Long Id) {
		// TODO Auto-generated method stub
		return productoRepository.findById(Id).get();
	}

	
	public Producto save(Producto produto) {
		// TODO Auto-generated method stub
		return productoRepository.save(produto);
	}
}
