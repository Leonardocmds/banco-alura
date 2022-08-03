package br.com.leo.banco.modelo;

import br.com.leo.banco.controle.AutenticacaoUtil;

public class Cliente implements Autenticavel {

	private String nome;
	private String cpf;
	private String endereco;
	private AutenticacaoUtil util;
	
	public Cliente(String nome, String cpf, String endereço) {
		this.util = new AutenticacaoUtil();
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereço;
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

	public String getEndereço() {
		return endereco;
	}

	public void setEndereço(String endereço) {
		this.endereco = endereço;
	}
	
	@Override
	public String toString() {
		return nome + ", CPF: " + cpf + ", Endereço: " + endereco;
	}

	public void setSenha(int senha) {
		this.util.setSenha(senha);
		
	}

	public boolean autentica(int senha) {
		return this.util.autentica(senha);
	}

}
