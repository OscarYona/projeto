package projeto.example.demo.service;

import java.util.List;
import projeto.example.demo.model.Marca;

public interface MarcaService {
	List<Marca> findAll();
	Marca findById(Long Id);
	Marca Save(Marca marca);
	Marca deleteById(Long Id);

}
