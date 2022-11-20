package br.com.bitBank.banco.test;

import br.com.bitBank.banco.modelo.Cliente;
import br.com.bitBank.banco.modelo.Conta;
import br.com.bitBank.banco.modelo.ContaCorrente;
import br.com.bitBank.banco.modelo.ContaPoupanca;

public class TesteArrayString {
	public static void main(String[] args) {
		
		System.out.println("Funcionou!!");

		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		
	}
}
