package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner tela = new Scanner(System.in);
        int numero, cont;

        System.out.println("Escolha seu numero:");
        numero = tela.nextInt();

        cont = 0;
        while (cont <= 10) {
            System.out.printf("%d x %2d = %02d\n", numero, cont, numero * cont);
            cont ++;
        }

        tela.close();
    }

    
}
