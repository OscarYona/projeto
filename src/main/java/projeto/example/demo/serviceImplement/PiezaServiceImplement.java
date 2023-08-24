package projeto.example.demo.serviceImplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import projeto.example.demo.model.Pieza;
import projeto.example.demo.repository.PiezaRepository;
import projeto.example.demo.service.PiezaService;

public class PiezaServiceImplement implements PiezaService{

	@Autowired
	PiezaRepository piezaRepository;
	
	
	public List<Pieza> findAll() {
		// TODO Auto-generated method stub
		return piezaRepository.findAll();
	}

	
	public Pieza findById(Long Id) {
		// TODO Auto-generated method stub
		return piezaRepository.findById(Id).get();
	}

	
	public Pieza save(Pieza peca) {
		// TODO Auto-generated method stub
		return piezaRepository.save(peca);
	}

}
