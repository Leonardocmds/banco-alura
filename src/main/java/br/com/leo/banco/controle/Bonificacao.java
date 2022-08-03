package br.com.leo.banco.controle;

import br.com.leo.banco.modelo.Funcionario;

public class Bonificacao {

	private double soma;
	
	public void registra(Funcionario f) {
		this.soma = f.getBonificacao() + soma; 
	}

	public double getSoma() {
		return soma;
	}

	
}
