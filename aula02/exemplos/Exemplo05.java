package exemplos;

import java.util.Scanner;

public class Exemplo05 {
    private static String x;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double peso;

        System.out.println("Qual o seu peso?");
        peso = entrada.nextDouble();

        x = "você tem " + peso + " kg";
        System.out.println(x);

        entrada.close();


    }
    
}
