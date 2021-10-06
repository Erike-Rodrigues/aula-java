public class AppPessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Andre");
        Endereco e = new Endereco("rua tatata", 265);

        p.setEndereco(e);
        p.exibir();
    }
    
}
