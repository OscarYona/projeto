package projeto.example.demo.serviceImplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import projeto.example.demo.model.Tag;
import projeto.example.demo.repository.TagRepository;
import projeto.example.demo.service.TagService;

public class TagServiceImplement implements TagService{

	@Autowired
	TagRepository tagRepository;
	
	public List<Tag> findAll() {
		// TODO Auto-generated method stub
		return tagRepository.findAll();
	}

	
	public Tag findById(Long Id) {
		// TODO Auto-generated method stub
		return tagRepository.findById(Id).get();
	}

	
	public Tag save(Tag tag) {
		// TODO Auto-generated method stub
		return tagRepository.save(tag);
	}

}