package projeto.example.demo.serviceImplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import projeto.example.demo.model.TipoPieza;
import projeto.example.demo.repository.TipoPiezaRepository;
import projeto.example.demo.service.TipoPiezaService;

public class TipoPiezaServiceImplement implements TipoPiezaService {

	@Autowired
	TipoPiezaRepository tipoPiezaRepository;
	
	public List<TipoPieza> findAll() {
		// TODO Auto-generated method stub
		return tipoPiezaRepository.findAll();
	}

	
	public TipoPieza findById(Long Id) {
		// TODO Auto-generated method stub
		return tipoPiezaRepository.findById(Id).get();
	}

	
	public TipoPieza save(TipoPieza tipopieza) {
		// TODO Auto-generated method stub
		return tipoPiezaRepository.save(tipopieza);
	}

}
