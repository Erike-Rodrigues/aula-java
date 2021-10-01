package uri;

import java.util.Scanner;

/* Questão solicitada:
Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A, 
e a soma de C com D for maior que a soma de A e B e se C e D, ambos, forem positivos e se a variável A for par escrever a mensagem "Valores aceitos", 
senão escrever "Valores nao aceitos". */

public class Uri1035 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, c, d,soma1,soma2;

        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();
        d = entrada.nextInt();

        soma1 = c + d;
        soma2 = a + b;

        if (b > c && d > a && soma1 > soma2 && c > 0 && d > 0 && a % 2 == 0){
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }


        entrada.close();
    }
    
}
