package projeto.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import projeto.example.demo.model.Pieza;
import projeto.example.demo.repository.PiezaRepository;

@Controller

public class PiezaController {
	
	@Autowired
	PiezaRepository piezaRepository;
	
	@RequestMapping(value="/pieza", method=RequestMethod.GET)
	public ModelAndView getPieza() {
		ModelAndView mav = new ModelAndView("pieza");
        List<Pieza> pieza = piezaRepository.findAll();
        mav.addObject("piezas", pieza);
        return mav;
	}
	@RequestMapping(value="/pieza/{id}", method=RequestMethod.GET)
	public ModelAndView getPieza1(@PathVariable("id") Long id) {
		ModelAndView mav = new ModelAndView("pieza1");
        Optional<Pieza> pieza = piezaRepository.findById(id);
        mav.addObject("nombre", pieza.get().getNombre());
        return mav;
	}

}