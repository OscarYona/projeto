package projeto.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import projeto.example.demo.model.Usuario;
import projeto.example.demo.repository.UsuarioRepository;

public class UsuarioController {

	@Autowired
    UsuarioRepository usuarioRepository;
	
	@RequestMapping(value="/usuario", method=RequestMethod.GET)
	public ModelAndView getUsuario() {
		ModelAndView mav = new ModelAndView("usuario");
        List<Usuario> usuario = usuarioRepository.findAll();
        mav.addObject("usuarios", usuario);
        return mav;
	}
	@RequestMapping(value="/usuario/{id}", method=RequestMethod.GET)
	public ModelAndView getUsuario1(@PathVariable("id") Long id) {
		ModelAndView mav = new ModelAndView("usuario1");
        Optional<Usuario> usuario = usuarioRepository.findById(id);
        mav.addObject("nombre", usuario.get().getNombre());
        return mav;
	}
}