package projeto.example.demo.service;

import java.util.List;

import projeto.example.demo.model.PcArmada;

public interface PcArmadaService {
	
List <PcArmada> findAll();
	
	PcArmada findById(Long Id);
	
	PcArmada save (PcArmada pc_armada);

}
