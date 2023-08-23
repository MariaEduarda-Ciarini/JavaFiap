package br.com.fiap.tds;

import java.util.Scanner;

public class IMC {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua altura em metros (exemplo: 1.75): ");
        double altura = scanner.nextDouble();

        System.out.print("Digite seu peso em quilogramas (exemplo: 70): ");
        double peso = scanner.nextDouble();

        double imc = peso / (altura * altura);

        if (imc >= 18.5 && imc <= 25) {
            System.out.println("Seu IMC é " + imc + ". Você está com o peso ideal.");
        } else {
            System.out.println("Seu IMC é " + imc + ". Você está fora do peso normal.");
        }

        scanner.close();
    }
}

