package projeto.example.demo.service;

import java.util.List;

import projeto.example.demo.model.TipoPieza;

public interface TipoPiezaService {
	List <TipoPieza> findAll();
	TipoPieza findById(Long Id);
	TipoPieza save(TipoPieza tipopieza);

}
