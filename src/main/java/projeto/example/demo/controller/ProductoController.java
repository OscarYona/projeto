package projeto.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import projeto.example.demo.model.Producto;
import projeto.example.demo.repository.ProductoRepository;

@Controller

public class ProductoController {

	@Autowired
    ProductoRepository productoRepository;
	
	@RequestMapping(value="/producto", method=RequestMethod.GET)
	public ModelAndView getProducto() {
		ModelAndView mav = new ModelAndView("producto");
        List<Producto> producto = productoRepository.findAll();
        mav.addObject("productos", producto);
        return mav;
	}
	@RequestMapping(value="/producto/{id}", method=RequestMethod.GET)
	public ModelAndView getProducto1(@PathVariable("id") Long id) {
		ModelAndView mav = new ModelAndView("producto1");
		Optional<Producto> producto = productoRepository.findById(id);
        mav.addObject("nombre", producto.get().getPreciocosto());
        return mav;
	}
	
}