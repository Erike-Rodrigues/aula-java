package exercicios;

// ajuda para estudo.
// equals. a string precisa ser exatamente igual.
// equalsIgnorecase. se o nome for igual retorna true.

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String senha, sistema;

        sistema = "R10p5";

        System.out.println("Digite sua senha:");
        senha = entrada.nextLine();

        if (senha.equals(sistema)){
            System.out.println("Acesso concedido!");
        } else {
            System.out.println("Acesso negado! tente novamente");
        }

        entrada.close();
    }
    
}
