import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double [] notas = new double [2];
        double mediaTurma;
        int qtdMaiorMedia;

        mediaTurma = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite as notas dos alunos: " + (i + 1));
            notas[i] = entrada.nextDouble();
            mediaTurma += notas[i];

        }
        mediaTurma /= notas.length;

        System.out.println("Notas digitadas: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i] + " ");
            
        }

        System.out.println("Notas maiores que a média: ");
        qtdMaiorMedia = 0;
        for (int i = 0; i < notas.length; i++) {
            if(notas[i] > mediaTurma){
                System.out.print(notas[i] + " ");
                qtdMaiorMedia ++;
            }
            
        }
        
        System.out.println("\nMédia da turma" + mediaTurma);

        System.out.println("Quantidade de notas acima da média: " + qtdMaiorMedia);
        entrada.close();
    }
    
}
