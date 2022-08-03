package br.com.leo.banco.controle;

import br.com.leo.banco.modelo.Autenticavel;

public class SistemaInterno {

	private int senha = 2222;
	
	public void autentica(Autenticavel fa) {
		boolean auth = fa.autentica(this.senha);
		if(auth) {
			System.out.println("Senha correta!"); 
		}else {
			System.out.println("Senha incorreta!");
			
		}
	}
	
}
