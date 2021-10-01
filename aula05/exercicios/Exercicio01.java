import java.util.Scanner;

//atalho para comentario na linha. ctrl + ;
// atalho para comentario em bloco. alt + shift + a

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, maior, menor;


        maior = Integer.MIN_VALUE; // o menor inteiro possivel
        menor = Integer.MAX_VALUE; // o maior inteiro possivel
        for (int i = 0; i < 10; i++){
            System.out.println("Digite o " + (i+1) + "° número");
            numero = entrada.nextInt();
            if(numero > maior) {
                maior = numero;
            }

            if (numero < menor){
                menor = numero;
            }
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);

        entrada.close();
    }
    
}
