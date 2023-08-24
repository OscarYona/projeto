package projeto.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import projeto.example.demo.model.PcArmada;
import projeto.example.demo.repository.PcArmadaRepository;

@Controller

public class PcArmadaController {

	@Autowired
    PcArmadaRepository pcArmadaRepository;
	
	@RequestMapping(value="/pcArmada", method=RequestMethod.GET)
	public ModelAndView getPcArmada() {
		ModelAndView mav = new ModelAndView("pcArmada");
		List<PcArmada> pcArmada = pcArmadaRepository.findAll();
        mav.addObject("pcArmada", pcArmada);
        return mav;
	}
	@RequestMapping(value="/pcArmada/{id}", method=RequestMethod.GET)
	public ModelAndView getPcArmada(@PathVariable("id") Long id) {
		ModelAndView mav = new ModelAndView("pcArmada");
        Optional<PcArmada> pcArmada = pcArmadaRepository.findById(id);
        mav.addObject("nombre",pcArmada.get().getNombre());
        return mav;
	}
}