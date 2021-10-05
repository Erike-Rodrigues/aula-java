package exemplos;

public class Exemplo01 {

    public static void main(String[] args) {
        linha();
        System.out.println("Programa versão 1.0.0");
        linha(); // chamando o método
        System.out.println("opções");
        int tamanho = "Opçoes".length(); // quantas letrar tem na frase.
        linha2(tamanho);

        linha3(10, '*');
        
    }

    static void linha(){ // void = não tem retorno
        System.out.println("----------------");
    }

    static void linha2(int tamanho){ // tamanho é um parametro.
        for(int i = 0; i < tamanho; i++){
            System.out.print("-");
        }
        System.out.println();
    }

    
    static void linha3(int tamanho, char letra){ // tamanho é um parametro.
        for(int i = 0; i < tamanho; i++){
            System.out.print(letra);
        }
        System.out.println();
    }

}