import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String [] nomes = new String [2];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite um Nome:");
            nomes[i] = entrada.nextLine();

        }

        System.out.println("Nomes digitados: ");

        
        for (int i = nomes.length - 1; i >= 0 ; i--){
            System.out.print(nomes[i] + " ");
        }

        entrada.close();
    }
    
}
