import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um valor inteiro:");
            numeros[i] = entrada.nextInt();

        }

        System.out.println("Voce digitou: ");


        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }

        entrada.close();

    
    }
}