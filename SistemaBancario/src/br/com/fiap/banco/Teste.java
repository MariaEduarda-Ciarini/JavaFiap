package br.com.fiap.banco;

public class Teste {
	
	public static void main(String[] args) {
		
		Conta cc = new Conta();
		cc.depositar(150.0); 
		cc.setAgencia(322);
		cc.setNumero(321);
		
		cc.depositar(8500);
		
		System.out.println(cc.getSaldo());
		
		
		Conta poupanca = new Conta(312, 334, 1600);
		poupanca.retirar(540);
		
		System.out.println(poupanca.getSaldo());
		
	}

}
