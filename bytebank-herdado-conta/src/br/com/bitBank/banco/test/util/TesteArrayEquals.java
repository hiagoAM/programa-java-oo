package br.com.bitBank.banco.test.util;

import java.util.ArrayList;
import br.com.bitBank.banco.modelo.Conta;
import br.com.bitBank.banco.modelo.ContaCorrente;

public class TesteArrayEquals {
	public static void main(String[] args) {
		
//		Conta cc1=new ContaCorrente(22,22);
//		Conta cc2=new ContaCorrente(22,22);
//		
//		boolean igual=cc1.ehIgual(cc2);
//		
//		System.out.println(igual);
		
		ArrayList<Conta> lista=new ArrayList<Conta>();
		
		Conta cc=new ContaCorrente(22,11);
		lista.add(cc);
		
		Conta cc2=new ContaCorrente(22, 22);
		lista.add(cc2);
		
		Conta cc3=new ContaCorrente(22, 22);
		boolean existe=lista.contains(cc2);

		
		for(Conta conta:lista) {
			if(conta.equals(cc3)) {
				System.out.println("Já tenho essa conta");
			}
		}
		
		
		for(Conta conta:lista) {
			System.out.println(conta);
		}
		
		
	}
		
		
}
