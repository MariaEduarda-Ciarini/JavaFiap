package br.com.fiap.tds;

public class OperadoresAritmeticos {

	public static void main(String[] args) {

		int x = 20;
		int y = 5;

		int soma = x + y;
		int subtracao = x - y;
		int multiplicacao = x * y;
		int divisao = x / y;
		int resto = x % y;

		System.out.println("Resultado da adição:  " + soma);
		System.out.println("Resultado da subtracao:  " + subtracao);
		System.out.println("Resultado da multiplicacao:  " + multiplicacao);
		System.out.println("Resultado da divisao:  " + divisao);
		System.out.println("Resultado da módulo:  " + resto);

		x++;
		System.out.println("Resultado do incremento de x:  " + x);

		y--;
		System.out.println("Resultado do decremento de y:  " + y);

		x += 10;
		System.out.println("Atribuição da aditiva de x:  " + x);

		y -= 10;
		System.out.println("Atribuição subtrativa de y:         " + y);
	}
}
