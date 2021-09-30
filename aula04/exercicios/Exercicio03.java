package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int limite, cont;

        System.out.println("Informe o valor limite!");
        limite = teclado.nextInt();

        cont = 1;
        while(cont <= limite){
            System.out.print(cont + ", ");
            cont *= 2; //cont = cont * 2;

        }

        System.out.println(cont);



        
        teclado.close();
    }
    
}
