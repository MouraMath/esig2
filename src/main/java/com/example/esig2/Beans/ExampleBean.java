package com.example.esig2.Beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ExampleBean {

	public String doSomething() {
		// Lógica para realizar quando o botão for pressionado
		return "pagina_de_resultados"; // Página de resultados após a ação
	}
}