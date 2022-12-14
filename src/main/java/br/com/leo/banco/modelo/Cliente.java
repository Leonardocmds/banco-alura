package br.com.leo.banco.modelo;

import br.com.leo.banco.controle.AutenticacaoUtil;

public class Cliente implements Autenticavel {

	private String nome;
	private String cpf;
	private String endereco;
	private AutenticacaoUtil util;
	
	public Cliente(String nome, String cpf, String enderešo) {
		this.util = new AutenticacaoUtil();
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = enderešo;
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

	public String getEnderešo() {
		return endereco;
	}

	public void setEnderešo(String enderešo) {
		this.endereco = enderešo;
	}
	
	@Override
	public String toString() {
		return nome + ", CPF: " + cpf + ", Enderešo: " + endereco;
	}

	public void setSenha(int senha) {
		this.util.setSenha(senha);
		
	}

	public boolean autentica(int senha) {
		return this.util.autentica(senha);
	}

}
