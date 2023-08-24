package projeto.example.demo.serviceImplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import projeto.example.demo.model.Marca;
import projeto.example.demo.repository.MarcaRepository;
import projeto.example.demo.service.MarcaService;

public class MarcaServiceImplement implements MarcaService{
	@Autowired
    MarcaRepository marcaRepository;
	
	@Override
	public List<Marca> findAll() {
		
		return marcaRepository.findAll();
	}
	@Override
	public Marca findById(Long Id) {
		
		return marcaRepository.findById(Id).get();
	}
	@Override
	public Marca Save(Marca marca) {
		
		return marcaRepository.save(marca);
	}

	@Override
	public Marca deleteById(Long Id) {
		
		return deleteById(Id);
	}


}
