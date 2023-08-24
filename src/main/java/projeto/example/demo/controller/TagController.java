package projeto.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import projeto.example.demo.model.Tag;
import projeto.example.demo.repository.TagRepository;

@Controller
public class TagController {

	@Autowired
    TagRepository tagRepository;
	
	@RequestMapping(value="/tag", method=RequestMethod.GET)
	public ModelAndView getTag() {
		ModelAndView mav = new ModelAndView("Tag");
        List<Tag> tag = tagRepository.findAll();
        mav.addObject("tags", tag);
        return mav;
	}
	@RequestMapping(value="/tag/{id}", method=RequestMethod.GET)
	public ModelAndView getTag1(@PathVariable("id") Long id) {
		ModelAndView mav = new ModelAndView("tag1");
        Optional<Tag> tag = tagRepository.findById(id);
        mav.addObject("nombre", tag.get().getNombre());
        return mav;
	}
}