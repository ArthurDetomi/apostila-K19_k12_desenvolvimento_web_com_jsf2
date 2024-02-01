package br.com.k19.apostila.componentesvisuais.bean;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ConsumidorBean {
	private String nome;
	private String email;
	private String telefone;
	private char sexo;
	private long numeroPedido;
	private String assunto;
	private String comentario;
	private String mensagem;
	
	public void gerarMensagem() {
		this.mensagem = toString();
	}

	@Override
	public String toString() {
		return "ConsumidorBean [nome=" + nome + ", email=" + email + ", telefone=" + telefone + ", sexo=" + sexo
				+ ", numeroPedido=" + numeroPedido + ", assunto=" + assunto + ", comentario=" + comentario + "]";
	}

	public Map<Character, String> getSexos() {
		Map<Character, String> map = new LinkedHashMap<>();
		map.put('M', "Masculino");
		map.put('F', "Feminino");
		return map;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public long getNumeroPedido() {
		return numeroPedido;
	}
	public void setNumeroPedido(long numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
}
