import java.util.Scanner;

/**
 * Exercicio02
 */
public class Exercicio02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int NUMERO_ALUNOS = 3;
        final int NUMERO_TURMAS = 2;
        double media, mediaTurma, mediaGeral;

        mediaGeral = 0;
        for (int turma = 1; turma <= NUMERO_TURMAS; turma++) {

            mediaTurma = 0;
            for (int alunos = 1; alunos <= NUMERO_ALUNOS; alunos++) {
                System.out.println("Informe a média do aluno " + alunos);
                media = entrada.nextDouble();
                mediaTurma += media;
            }

            mediaTurma /= NUMERO_ALUNOS;
            System.out.printf("Média da turma: %.2f\n ", mediaTurma);

            mediaGeral += mediaTurma;

        }

        mediaGeral /= NUMERO_TURMAS;
        System.out.println("Média Geral:  " + mediaGeral);



        entrada.close();

    }
}