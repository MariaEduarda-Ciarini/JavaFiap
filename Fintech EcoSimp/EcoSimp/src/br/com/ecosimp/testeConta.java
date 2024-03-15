package br.com.ecosimp;

import java.util.Date;

public class testeConta {

    public static void main(String[] args) {
        // Cria uma conta com valores padrão (opcional)
    	Conta conta = new Conta(10, 100, null, 0, null);

        // Exibe informações da conta
        System.out.println("ID da conta: " + conta.getId());
        System.out.println("Saldo da conta: " + conta.getSaldo());
        // ... (exibir outros atributos se desejar)

        // Solicitar entrada do usuário (alternativa)
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o ID do cliente: ");
        int idCliente = scanner.nextInt();

        System.out.print("Informe o valor do pagamento da fatura: ");
        double pagamentoFatura = scanner.nextDouble();

        // ... (solicitar outros dados)

        Conta conta = new Conta(1, 100.0, new Cliente(idCliente), pagamentoFatura, new Date());
        */
    }
}

