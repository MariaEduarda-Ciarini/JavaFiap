package com.fiap.view;

import com.fiap.entity.Produto;

public class Caixa {
	
	public static void main(String[] args) {
		
//		int qtdProdutos = 5;
//		int registro = 0;
//		
//		while (registro < qtdProdutos) {
//			registro ++;
//			System.out.println("O produto número " + registro + " foi registrado");
//		}
//
	
         
//	     do {
//	    	 registro++;
//	    	 System.out.println("O caixa registrou o produto " + registro);
//	     } while (registro < qtdProdutos);
		
//		for (int i = 1; i <= qtdProdutos; i++) {
//			System.out.println("O caixa registrou o produto " + i);
//		}
	     
//	   }

//}    
		Produto[] produtos = new Produto[2];
		
		Produto prod1 = new Produto();
		prod1.setNome("Morango");
		prod1.setDescricao("vermelin");
		prod1.setValor(12);
		
		Produto prod2 = new Produto();
		prod2.setNome("Banana");
		prod2.setDescricao("Prata");
		prod2.setValor(8);
		
		produtos[0] = prod1;
		produtos[1] = prod2;
		
//		for(int i=0; i< produtos.length; i++) {
//			System.out.println(produtos[i].toString());
//		}
	    for (Produto prod: produtos) {
	    	System.out.println(prod.toString());
	    }
	}
}
