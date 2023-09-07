package com.example.esig2.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalarioService {

	@Autowired
	private PessoaRepository pessoaRepository;

	@Autowired
	private CargoRepository cargoRepository;

	// Implemente a lógica de cálculo dos salários aqui
}