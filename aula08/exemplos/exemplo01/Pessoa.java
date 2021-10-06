public class Pessoa {
    private String nome;
    private Endereco endereco;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public void exibir(){
        System.out.println(nome);
        endereco.exibir();
    }

}
