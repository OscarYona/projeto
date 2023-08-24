package projeto.example.demo.service;

import java.util.List;

import projeto.example.demo.model.Usuario;

public interface UsuarioService {
	List <Usuario> findAll();
	Usuario findById(Long Id);
	Usuario save(Usuario usuario);

}
