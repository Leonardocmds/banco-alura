package br.com.leo.banco.modelo;

public abstract class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;

	public Conta(int agencia, int numero, Cliente titular) {
		total++;
		System.out.println("O total de conta criadas é:" + total);
		this.agencia = agencia;
		this.numero = numero;
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public double deposita(double valor) {
		return this.saldo += valor;

	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			System.out.println("Saldo insuficiente");
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			System.out.println("Saldo insuficiente");
			return false;
		}
	}

	@Override
	public boolean equals(Object ref) {
		Conta outra = (Conta) ref;
		if (this.agencia != outra.agencia) {
			return false;
		}

		if (this.numero != outra.numero) {
			return false;
		}

		return false;

	}

	public static int getTotal() {
		return total;
	}

	@Override
	public String toString() {
		return "Titular: " + titular + ", Agencia: " + agencia + ", Número: " + numero + ", Saldo: " + saldo;
	}

}
