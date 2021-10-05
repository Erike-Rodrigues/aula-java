package exemplos.exemplo01;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    } // fim do construtor.

    public void exibir(){
        System.out.println(nome + " - " + salario);

    } // fim do exibir

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void aumentaSalario(double porcentagem){
        salario = salario + salario * porcentagem / 100;
    }

    @Override
    public String toString(){
        return nome + ": R$ " + salario;

    }
    
}
