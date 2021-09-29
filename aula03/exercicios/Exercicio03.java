package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double num1, num2;

        System.out.println("Digite dois numeros");
        num1 = entrada.nextDouble();
        num2 = entrada.nextDouble();

        System.out.println("Ordem crescente:");
        if(num1 > num2){
            
            System.out.println(num1 + "\n" + num2);
        } else {
            System.out.println(num2 + "\n" + num1);
        }

        entrada.close();
    }
    
}
