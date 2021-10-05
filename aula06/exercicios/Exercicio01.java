package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Digite um valor inteiro:");
        numero = entrada.nextInt();
        entrada.close();

        if(ehpar(numero)){
            System.out.println(numero + " é par");
        } else {
            System.out.println(numero + " é impar");
        }

        
    } // fim do main

    static boolean ehpar(int numero){

        if(numero % 2 == 0){
            return true;
        } else {
            return false;
        }
    }  // fim do metodo.

}
