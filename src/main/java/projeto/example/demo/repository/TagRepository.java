package projeto.example.demo.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import projeto.example.demo.model.Tag;

public interface TagRepository extends JpaRepository<Tag, Long>{
	
}