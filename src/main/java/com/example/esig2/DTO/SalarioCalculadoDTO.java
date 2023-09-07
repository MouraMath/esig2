package com.example.esig2.DTO;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class SalarioCalculadoDTO {
	private Integer cargoId;
	private BigDecimal salarioBase;
	private BigDecimal planoDeSaude = BigDecimal.valueOf(350);
	private BigDecimal previdencia = BigDecimal.valueOf(11);
	private BigDecimal gratificacaoCoordenador = BigDecimal.ZERO;
	private BigDecimal gratificacaoGerente = BigDecimal.ZERO;
	private BigDecimal salarioTotal;

	public void calcularSalario() {
		if (cargoId == 1) {
			salarioBase = BigDecimal.valueOf(400);
		} else if (cargoId == 2) {
			salarioBase = BigDecimal.valueOf(1000);
		} else if (cargoId == 3) {
			salarioBase = BigDecimal.valueOf(2500);
		} else if (cargoId == 4) {
			salarioBase = BigDecimal.valueOf(5000);
			gratificacaoCoordenador = BigDecimal.valueOf(500);
		} else if (cargoId == 5) {
			salarioBase = BigDecimal.valueOf(6500);
			gratificacaoGerente = BigDecimal.valueOf(1000);
		}

		salarioTotal = salarioBase.subtract(planoDeSaude).subtract(previdencia)
				.add(gratificacaoCoordenador).add(gratificacaoGerente);
	}
}
