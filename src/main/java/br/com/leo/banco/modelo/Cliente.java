package br.com.leo.banco.modelo;

import br.com.leo.banco.controle.AutenticacaoUtil;

public class Cliente implements Autenticavel {

	private String nome;
	private String cpf;
	private String endereco;
	private AutenticacaoUtil util;
	
	public Cliente(String nome, String cpf, String endere�o) {
		this.util = new AutenticacaoUtil();
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endere�o;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndere�o() {
		return endereco;
	}

	public void setEndere�o(String endere�o) {
		this.endereco = endere�o;
	}
	
	@Override
	public String toString() {
		return nome + ", CPF: " + cpf + ", Endere�o: " + endereco;
	}

	public void setSenha(int senha) {
		this.util.setSenha(senha);
		
	}

	public boolean autentica(int senha) {
		return this.util.autentica(senha);
	}

}
