package br.com.leo.banco.modelo;

import br.com.leo.banco.controle.AutenticacaoUtil;

public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoUtil util;

	public Gerente(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		this.util = new AutenticacaoUtil();
	}

	@Override
	public double getBonificacao() {
		return super.getSalario();
	}

	public void setSenha(int senha) {
		this.util.setSenha(senha);

	}

	public boolean autentica(int senha) {
		return this.util.autentica(senha);
	}

}
