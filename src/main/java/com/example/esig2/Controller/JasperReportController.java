package com.example.esig2.Controller;

import com.example.esig2.DTO.SalarioCalculadoDTO;
import com.example.esig2.Service.SalarioService;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/relatorio")
public class RelatorioController {

	@Autowired
	private SalarioService salarioService;

	@GetMapping("/salarios")
	public void gerarRelatorioSalarios(HttpServletResponse response) throws IOException, JRException {
		// Recupere os dados dos salários do seu serviço
		List<SalarioCalculadoDTO> salarios = salarioService.listarSalarios();

		// Carregue o arquivo do relatório JasperReports
		InputStream jasperStream = getClass().getResourceAsStream("/caminho/para/seu/relatorio.jasper");
		JasperReport jasperReport = (JasperReport) JRLoader.loadObject(jasperStream);

		// Crie um mapa de parâmetros, se necessário
		Map<String, Object> params = new HashMap<>();

		// Crie o JasperPrint
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, new JRBeanCollectionDataSource(salarios));

		// Exporte o relatório em PDF
		response.setContentType("application/pdf");
		response.setHeader("Content-Disposition", "inline; filename=relatorio_salarios.pdf");

		JasperExportManager.exportReportToPdfStream(jasperPrint, response.getOutputStream());
	}
}
