package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número inteiro:");
        numero = entrada.nextInt();

        if(numero > 20){
            System.out.println("A metade é: " + (numero / 2.0));

        }

        entrada.close();
    
    }
  
}

