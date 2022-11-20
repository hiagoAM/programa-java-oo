package br.com.bitBank.banco.test;

import br.com.bitBank.banco.modelo.Conta;
import br.com.bitBank.banco.modelo.ContaCorrente;
import br.com.bitBank.banco.modelo.GuardadorDeContas;

public class Teste {
	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc=new ContaCorrente(22,11);
		guardador.adiciona(cc);
		
		Conta cc2=new ContaCorrente(22,22);
		guardador.adiciona(cc2);
		
		int tamanho=guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref=(Conta) guardador.getReferencia(1);
		System.out.println(ref.getNumero());
		
		
	}
}
