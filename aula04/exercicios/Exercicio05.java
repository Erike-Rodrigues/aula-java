package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int INTERACAO = 10; // final = constante, não pode ser mudado o valor
        int numero, pares = 0;

        // INTERACAO = 10; é impossivel de modificar.

        for (int i = 1; i <= INTERACAO; i++) {
            System.out.printf("Digite o %d° número: \n", i);
            numero = entrada.nextInt();

            if(numero % 2 ==0){
                pares++;
            }
        }

        System.out.println("O total de pares é " + pares);
        System.out.println("O total de pares é " + (INTERACAO - pares));

        entrada.close();
        
    }
    
}
