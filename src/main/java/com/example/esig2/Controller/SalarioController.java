package com.example.esig2.Controller;

import com.example.esig2.DTO.SalarioCalculadoDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalarioController {

	@GetMapping("/calcularSalario")
	public SalarioCalculadoDTO calcularSalario(@RequestParam Long cargoId) {
		SalarioCalculadoDTO salarioDTO = new SalarioCalculadoDTO();
		salarioDTO.setCargoId(Math.toIntExact(cargoId));
		salarioDTO.calcularSalario();
		return salarioDTO;
	}
}