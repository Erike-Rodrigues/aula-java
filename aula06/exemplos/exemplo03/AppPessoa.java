package exemplos.exemplo03;

public class AppPessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Miguel", 23);
        Pessoa p2 = new Pessoa("Armando", 32);

        p.apresentar();
       // p2.nome = "Armando";
       // p2.idade = 32;
        p2.apresentar();

        
    }
}
