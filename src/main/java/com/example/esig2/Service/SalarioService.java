package com.example.esig2.Service;

import com.example.esig2.DTO.SalarioCalculadoDTO;
import com.example.esig2.Repository.CargoRepository;
import com.example.esig2.Repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class SalarioService extends SalarioCalculadoDTO {

	@Autowired
	private PessoaRepository pessoaRepository;

	@Autowired
	private CargoRepository cargoRepository;

	public List<SalarioDTO> listarSalarios() {
		return (List<SalarioDTO>) getSalarioTotal();
	}

	// Implemente a lógica de cálculo dos salários aqui
}