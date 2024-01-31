package br.com.k19.apostila;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class TextoBean {
	private String texto;
	
	public String transformarEmCaixaAlta() {
		this.texto = this.texto.toUpperCase();
		return "resposta";
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
}
