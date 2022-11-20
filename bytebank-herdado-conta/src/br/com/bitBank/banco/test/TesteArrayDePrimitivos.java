package br.com.bitBank.banco.test;

import br.com.bitBank.banco.modelo.ContaCorrente;
import br.com.bitBank.banco.modelo.ContaPoupanca;

public class TesteArrayDePrimitivos {
	
	public static void main(String[]args) {
		
		int[] idades=new int[5];
		
		for(int i=0; i<idades.length; i++) {
			idades[i]= i*i;
		}
		
		for(int i=0; i<idades.length;i++) {
			System.out.println(idades[i]);
		}
	}
}
