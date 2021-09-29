package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, credito, prestacao;

        System.out.println("Digite Seu salário, Em seguida sua prestação desejada!");
        salario = entrada.nextDouble();
        credito = entrada.nextDouble();
        prestacao = salario * 0.3;

        if (credito > prestacao){
            System.out.println("Prestação de credito negada!");

        } else{
            System.out.println("Prestação de credito aprovada!");
            
        }

        entrada.close();
        
    }
    
}
