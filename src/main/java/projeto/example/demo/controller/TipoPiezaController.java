package projeto.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import projeto.example.demo.model.TipoPieza;
import projeto.example.demo.repository.TipoPiezaRepository;

@Controller

public class TipoPiezaController {
	
	@Autowired
	TipoPiezaRepository tipoPiezaRepository;
	
	@RequestMapping(value= "/TipoPieza", method=RequestMethod.GET)
	public ModelAndView getTipoPieza() {
		ModelAndView mav = new ModelAndView("tipoPieza");
        List<TipoPieza> tipoPieza = tipoPiezaRepository.findAll();
        mav.addObject("tipoPieza", tipoPieza);
        return mav;
	}
	
	@RequestMapping(value="/tipoPieza/{id}", method=RequestMethod.GET)
	public ModelAndView getTipoPieza1(@PathVariable("id") Long id) {
		ModelAndView mav = new ModelAndView("tipo>Pieza1");
        Optional<TipoPieza> tipoPieza = tipoPiezaRepository.findById(id);
        mav.addObject("nombre", tipoPieza.get().getNombre());
        return mav;
	}

}
