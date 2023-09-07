package com.example.esig2.Controller;

import com.example.esig2.Entity.UsuarioEntity;
import com.example.esig2.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@PostMapping("/criar")
	public UsuarioEntity criarUsuario(@RequestBody UsuarioEntity usuarioEntity) {
		return usuarioService.criarUsuario(usuarioEntity);
	}

	@GetMapping("/{login}")
	public UsuarioEntity buscarPorLogin(@PathVariable String login) {
		return usuarioService.buscarPorLogin(login);
	}
}
