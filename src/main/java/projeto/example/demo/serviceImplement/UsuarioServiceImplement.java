package projeto.example.demo.serviceImplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import projeto.example.demo.model.Usuario;
import projeto.example.demo.repository.UsuarioRepository;
import projeto.example.demo.service.UsuarioService;

public class UsuarioServiceImplement implements UsuarioService {
	@Autowired
	UsuarioRepository usuarioRepository;

	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return usuarioRepository.findAll();
	}

	@Override
	public Usuario findById(Long Id) {
		// TODO Auto-generated method stub
		return usuarioRepository.findById(Id).get();
	}

	@Override
	public Usuario save(Usuario usuario) {
		// TODO Auto-generated method stub
		return usuarioRepository.save(usuario);
	}

}
