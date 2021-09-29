package exercicios;

//exercicio feito acompanhando professor

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salarioBruto;

        System.out.println("#### TAXAS DO INSS####");
        System.out.println("Digite o valor do salário:");
        salarioBruto = entrada.nextDouble();

        if (salarioBruto <= 600){
            System.out.println("Isento de taxa");
        } else {
            if(salarioBruto <= 1200){
                System.out.println("Taxa de 20%");
            } else {
                if (salarioBruto <= 2000){
                    System.out.println("Taxa de 20%");
                } else {
                    System.out.println("Taxa de 30%");
                }
            }

        }

        entrada.close();

    }
    
}
