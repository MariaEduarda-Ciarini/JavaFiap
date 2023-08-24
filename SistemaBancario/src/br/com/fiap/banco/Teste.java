package br.com.fiap.banco;

public class Teste {
	
	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		conta1.depositar(5000);
		conta1.retirar(1500);
		
		ContaCorrente2 conta2 = new ContaCorrente2();
		conta2.depositar(4500);
		conta2.retirar(950);
		
		Conta conta3 = new ContaCorrente2();
		conta3.depositar(2500);
		conta3.retirar(950);
		
		
		System.out.println("Conta1: " + conta1.getSaldo());
		System.out.println("Conta2: " + conta2.getSaldo());
		System.out.println("Conta3: " + conta3.getSaldo());
	}

}
