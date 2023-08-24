package projeto.example.demo.service;

import java.util.List;

import projeto.example.demo.model.Tag;

public interface TagService {
	List <Tag> findAll();
	Tag findById(Long Id);
	Tag save(Tag tag);

}
