public class Exemplo04 {
    public static void main(String[] args) {
        // %d números inteiros
        System.out.printf("%d\n", 3);
        System.out.printf("%2d\n", 3); // 2 - duas cadas para exibir
        System.out.printf("%02d\n", 3); // 0 - o valor vai preencher o quando tiver menos digito

        System.out.printf("%d %d\n", 3, 4);

        System.out.println("Utilizando %f abaixo:");

        // %f numeros inteiro
        //%.yf  y numero de casas decimais.

        System.out.printf("%.2f\n", 4.543);
    }
    
}
