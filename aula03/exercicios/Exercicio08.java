package exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, c;
        boolean triangulo;

        System.out.println("Digite os 3 valores:");
        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();

        triangulo = (a <= b + c) && (b <= a + c) && (c <= a + c);

        if(triangulo){
            if (a == b && b == c){
                System.out.println("Triângulo Equilátero");

            } else {
                if(a == b || a == c || b == c){
                    System.out.println("Triangulo isosceles");

                } else {
                    System.out.println("Triangulo escaleno");
                }
            }
        } else {
            System.out.println("Os lados não formam um triângulo");
        }

        entrada.close();
    }
    
}
