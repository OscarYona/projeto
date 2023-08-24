package projeto.example.demo.service;

import java.util.List;

import projeto.example.demo.model.Pieza;

public interface PiezaService {
	List <Pieza> findAll();
	Pieza findById(Long Id);
	Pieza save(Pieza pieza);

}
