package uri;
import java.util.Scanner;

public class Uri1006 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1,nota2,nota3,media;

        nota1 = entrada.nextDouble();
        nota2 = entrada.nextDouble();
        nota3 = entrada.nextDouble();

        media = (nota1 * 0.2) + (nota2 * 0.3) + (nota3 * 0.5);

        System.out.printf("MEDIA = %.1f ", media);

        entrada.close();

    }
}


    

