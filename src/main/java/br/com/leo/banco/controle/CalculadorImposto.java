package br.com.leo.banco.controle;

import br.com.leo.banco.modelo.Tributavel;

public class CalculadorImposto {
	
	private double totalImposto;
	
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}

}
