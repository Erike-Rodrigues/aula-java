package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num,soma,cont;

        num = 1;
        soma = 0;
        cont = 1;

        System.out.println("Para finalizar o programa, Digite 0:");
        while (num != 0){
            System.out.printf("Digite o %d° número: \n", cont++);
            num = entrada.nextInt();
            soma = soma + num;

        }

        System.out.println("Resultado da soma dos numeros é = " + soma);
        System.out.println("Fim do Programa!!");
        
        entrada.close();
    }
}