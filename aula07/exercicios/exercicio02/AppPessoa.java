package exercicios.exercicio02;

public class AppPessoa {
    public static void main(String[] args) {
        // uma classe abstrata não pode gerar objetos.
        // Pessoa p = new Pessoa("Davi", "11- 99622- 5555");
        Estudante e = new Estudante("Gustavo", "83 9 5555-4576", "Geografia");
        Professor pr = new Professor ("Ellen", "11 5588-6598", 2000);

        //System.out.println(p);
        System.out.println(e);
        System.out.println(pr);
    }
    
}
