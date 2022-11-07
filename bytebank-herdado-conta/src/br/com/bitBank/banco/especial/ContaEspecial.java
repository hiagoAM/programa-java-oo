package br.com.bitBank.banco.especial;

import br.com.bitBank.banco.modelo.Conta;

public class ContaEspecial extends Conta {

	 public ContaEspecial(int agencia, int numero){
	      super(agencia, numero);
	    }
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;

	}

}
