package com.example.esig2.Service;

import com.example.esig2.Entity.UsuarioEntity;
import com.example.esig2.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public UsuarioEntity criarUsuario(UsuarioEntity usuarioEntity) {
		// Implemente a lógica para criar um usuário
		return usuarioRepository.save(usuarioEntity);
	}

	public UsuarioEntity buscarPorLogin(String login) {
		return usuarioRepository.findByLogin(login);
	}
}