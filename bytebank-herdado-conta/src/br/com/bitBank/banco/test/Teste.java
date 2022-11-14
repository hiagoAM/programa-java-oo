package br.com.bitBank.banco.test;

import br.com.bitBank.banco.modelo.ContaCorrente;
import br.com.bitBank.banco.modelo.ContaPoupanca;

public class Teste {
	
	public static void main(String[]args) {
		//System.out.println("x");
		//System.out.println(3);
		//System.out.println(false);
		
		ContaCorrente cc = new ContaCorrente(22,33);
		ContaPoupanca cp = new ContaPoupanca(33,22);
		
		System.out.println(cc);
		System.out.println(cp);
		
		println();
		
	}
	
	
	static void println() {
		
	}
	
	static void println(int a) {
		
	}
	
	static void println(boolean valor) {
		
	}
	
	
}
