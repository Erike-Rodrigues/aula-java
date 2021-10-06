import java.util.Scanner;

public class AppContas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;
        int numeroConta;
        double limite, valor;
        ContaCorrente cc = null;
        ContaEspecial ce = null;
        ContaPoupanca cp = null;

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
                    cc = new ContaCorrente(numeroConta);

                    break;

                case 2:
                    System.out.println("Digite o número da conta");
                    numeroConta = entrada.nextInt();
                    limite = entrada.nextDouble();
                    ce = new ContaEspecial(numeroConta,limite);
                    break;

                case 3:
                    System.out.println("Digite o número da conta: ");
                    numeroConta = entrada.nextInt();
                    cp = new ContaPoupanca(numeroConta);
                    break;

                case 4:
                    System.out.println("Informe o valor do depósito: ");
                    valor = entrada.nextDouble();

                    if(cc.deposito(valor)){
                        System.out.println("Deposito realizado!");
                    } else {
                        System.out.println("Falha ao realizar o depósito.");
                    } 
                    break;

                case 5:
                    System.out.println("Informe o valor do depósito: ");
                    valor = entrada.nextDouble();

                    if(cc.saque(valor)){
                        System.out.println("Saque realizado!");
                    } else {
                        System.out.println("Falha ao realizar o Saque.");
                    }
                    break;

                case 6:
                    System.out.println(cc);
                    System.out.println(ce);
                    System.out.println(cp);
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
