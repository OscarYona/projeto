package projeto.example.demo.serviceImplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import projeto.example.demo.model.PcArmada;
import projeto.example.demo.repository.PcArmadaRepository;
import projeto.example.demo.service.PcArmadaService;

public class PcArmadaServiceImplement implements PcArmadaService{

	@Autowired
	PcArmadaRepository pcArmadaRepository;
	
	public List<PcArmada> findAll() {
		// TODO Auto-generated method stub
		return pcArmadaRepository.findAll();
	}

	
	public PcArmada findById(Long Id) {
		// TODO Auto-generated method stub
		return pcArmadaRepository.findById(Id).get();
	}

	
	public PcArmada save(PcArmada pc_armada) {
		// TODO Auto-generated method stub
		return pcArmadaRepository.save(pc_armada);
	}

}