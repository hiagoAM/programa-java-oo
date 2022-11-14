package br.com.bitBank.banco.test;

public class testeString {
	
	public static void main(String[]args) {
		
		String nome="Alura";
		
		String vazio ="       Alura    ";
		String outroVazio=vazio.trim();	
		System.out.println(vazio.contains("Al"));
		System.out.println(outroVazio);
		
		//char c=nome.charAt(0);
		
		//int pos = nome.indexOf("ur");
		//System.out.println(pos);
		
		//System.out.println(nome.length());
		//for(int i=0; i<nome.length(); i++) {
		//	System.out.println(nome.charAt(i));
		//}
		
		//String sub=nome.substring(1);
		//System.out.println(sub);
		
		//String outra = nome.replace("A", "a");
		//nome.toLowerCase();
		
		//String outra = nome.toUpperCase();
		
		System.out.println("String imutavel="+nome);
		//System.out.println(outra);
		//System.out.println(c);
	}
}
