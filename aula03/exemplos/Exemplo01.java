package exemplos;

import java.util.Scanner;

/**
 * Exemplo01
 */
public class Exemplo01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota;

        System.out.println("Digite a nota do aluno:");
        nota = entrada.nextDouble();

        if (nota >= 6){
            System.out.println("Aluno aprovado !");
        }

        System.out.println("Final do programa");

        entrada.close();
        
    }
}