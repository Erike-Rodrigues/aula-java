package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    
        double nota1;
        double nota2;

        System.out.println("Digite a primeira nota:");
        nota1 = entrada.nextDouble();

        System.out.println("Digite sua segunda nota:");
        nota2 = entrada.nextDouble();

        System.out.println("Sua média é: " + (nota1 + nota2) / 2.0);

        entrada.close();
    }
    
}
