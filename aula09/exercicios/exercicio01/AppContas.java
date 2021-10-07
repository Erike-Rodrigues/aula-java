package exercicios.exercicio01;

import java.util.Scanner;

import exercicios.exercicio01.dao.GerenciaContas;

public class AppContas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;
        int numeroConta;
        double limite, valor;

        GerenciaContas contas = new GerenciaContas();

        do {
            System.out.println("1 - Nova Conta Corrente:");
            System.out.println("2 - Nova Conta Especial:");
            System.out.println("3 - Nova Conta Poupança:");
            System.out.println("4 - Depositar:");
            System.out.println("5 - Sacar:");
            System.out.println("6 - Consultar saldo:");
            System.out.println("7 - Sair:");
            opcao = entrada.nextInt();

            switch(opcao) {
                case 1:
                    System.out.println("Digite o número da conta: ");
                    numeroConta = entrada.nextInt();
                    contas.novaContaCorrente(numeroConta);

                    break;

                case 2:
                    System.out.println("Digite o número da conta");
                    numeroConta = entrada.nextInt();
                    limite = entrada.nextDouble();
                    contas.NovaContaEspecial(numeroConta, limite);
                    break;

                case 3:
                    System.out.println("Digite o número da conta: ");
                    numeroConta = entrada.nextInt();
                    contas.NovaContaPoupanca(numeroConta);
                    break;

                case 4:
                    System.out.println("Digite o numero da conta: ");
                    numeroConta = entrada.nextInt();
                    System.out.println("Informe o valor do depósito: ");
                    valor = entrada.nextDouble();

                    if(contas.deposito(numeroConta, valor)){
                        System.out.println("Deposito realizado!");
                    } else {
                        System.out.println("Falha ao realizar o depósito.");
                    } 
                    break;

                case 5:
                    System.out.println("Digite o numero da conta: ");
                    numeroConta = entrada.nextInt();
                    System.out.println("Informe o valor do depósito: ");
                    valor = entrada.nextDouble();

                    if(contas.saque(numeroConta,valor)){
                        System.out.println("Saque realizado!");
                    } else {
                        System.out.println("Falha ao realizar o Saque.");
                    }
                    break;

                case 6:
                    System.out.println("Digite o numero da conta: ");
                    numeroConta = entrada.nextInt();
                    System.out.println(contas.saldo(numeroConta));
                    
                    
                    break;

                case 7:
                    break;

                default:
                    System.out.println("Opção inválida.");

            }

        } while(opcao != 7);

        entrada.close();
    }

}
