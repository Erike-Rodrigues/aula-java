package exemplos.exemplo01;

public class AppFuncionario {
    public static void main(String[] args) {
        // cria um Gerente utilizando o construtor com 3 parametros
        Funcionario f = new Funcionario("Carlos", 1000);
        // cria um gerente utilizando o construtor com 1 parametro
        Gerente g = new Gerente("Pedro", 2000, 10);
        Gerente g2 = new Gerente("João");

        f.aumentaSalario(10);
        f.exibir();
        g.aumentaSalario(10);
        g.exibir();
        g2.exibir();

        System.out.println(f);
        System.out.println(g);
        
    } // fim do main
  
}
