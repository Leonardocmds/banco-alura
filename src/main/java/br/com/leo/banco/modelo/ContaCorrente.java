package br.com.leo.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel{

	public ContaCorrente(int agencia, int numero, Cliente titular) {
		super(agencia, numero, titular);
	}

	public double getValorImposto() {
		return super.getSaldo() * 0.01;
	}

}
