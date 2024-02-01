package br.com.k19.apostila.visaogeral.exercicio;

import java.util.Random;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class NumeroAleatorioBean {
	
	private Integer numeroMaximo;
	private Integer numeroAleatorio;
	
	public void gerarNumeroAleatorio() {
		Random rand = new Random();
		this.numeroAleatorio = rand.nextInt(this.numeroMaximo);
	}

	public Integer getNumeroMaximo() {
		return numeroMaximo;
	}

	public void setNumeroMaximo(Integer numeroMaximo) {
		this.numeroMaximo = numeroMaximo;
	}

	public Integer getNumeroAleatorio() {
		return numeroAleatorio;
	}

	public void setNumeroAleatorio(Integer numeroAleatorio) {
		this.numeroAleatorio = numeroAleatorio;
	}
	
	
	
}
