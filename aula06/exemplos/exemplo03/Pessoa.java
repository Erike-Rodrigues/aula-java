package exemplos.exemplo03;


public class Pessoa {
    //atributos
    String nome;
    int idade;

    // método construtor - inicializar os dados objetos
    Pessoa(String nome, int idade){
        this.nome = nome; // this se refere ao objeto(atributo)
        this.idade = idade;

    }

    // métodos 
    void apresentar(){
        System.out.println("Olá! me chamo " + nome);

    }
    
}