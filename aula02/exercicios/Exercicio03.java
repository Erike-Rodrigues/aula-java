package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salario, novoSalario;

        System.out.println("Digite o valor do salário:");
        salario = teclado.nextDouble();

        novoSalario = salario * 1.25;

        System.out.println("Novo Salário = " + novoSalario);

        teclado.close();
    }
    
}
