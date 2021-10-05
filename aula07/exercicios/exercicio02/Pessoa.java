package exercicios.exercicio02;

// uma classe abstrata não pode instanciar (criar) objetos.
// ela serve apenas como modelo para outras classes.
public abstract class Pessoa {
    private String nome;
    private String telefone;

    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;

    } // fim do construtor

    @Override
    public String toString() {
        return nome + ": " + telefone;

    } // fim do Override
    
} // fim da classe pessoa
