package com.java;

public class TesteConta {
	
	public static void main(String[]args ) {
		
		Conta contaCorrente = new Conta();
		Conta contaPoupança = new Conta();
		Conta contaInvestimento = new Conta();
		
		contaCorrente.numero = 12;
		contaCorrente.saldo = 900.92;
		contaCorrente.cliente.nome = "LenardoDV";
		contaCorrente.cliente.idade = 20;
		
		contaPoupança.numero = 10;
		contaPoupança.saldo = 50;
		contaPoupança.cliente.nome = "Kylie";
		contaPoupança.cliente.idade = 10;
		
		
		contaInvestimento.numero = 32;
		contaInvestimento.saldo = 1000;
		contaInvestimento.cliente.nome = "Buffet";
		contaInvestimento.cliente.idade = 16;
		
		System.out.println(contaCorrente.numero);
		System.out.println(contaCorrente.saldo);
		System.out.println(contaCorrente.cliente.nome);
		System.out.println(contaCorrente.cliente.idade);
		
		
	}

}
