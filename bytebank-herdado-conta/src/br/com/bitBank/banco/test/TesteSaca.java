package br.com.bitBank.banco.test;

import br.com.bitBank.banco.modelo.Conta;
import br.com.bitBank.banco.modelo.ContaCorrente;
import br.com.bitBank.banco.modelo.SaldoInsuficienteException;

public class TesteSaca {
	
	public static void main(String[]args) {
		
		Conta conta = new ContaCorrente(123, 321);
		
		conta.deposita(200.0);
		try {
			conta.saca(290.0);
		}catch (SaldoInsuficienteException ex) {
			System.out.println("Ex: "+ex.getMessage());
		}
		
		System.out.println("saldo atual: "+conta.getSaldo());
		
	}
	
}
