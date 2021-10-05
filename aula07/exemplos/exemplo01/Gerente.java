package exemplos.exemplo01;

public class Gerente extends Funcionario {
    private int numFuncionarios;

    public Gerente(String nome, double salario, int numFuncionarios){
        super(nome, salario);
        this.numFuncionarios = numFuncionarios;

    } // fim do construtor.

    //Overload poliformismo
    public Gerente(String nome) {
        super(nome, 0);
    } // fim do overload

    // @ é uma anotação
    // @Override indicaque o método foi sobrescrito
    @Override
    public void exibir() {
        System.out.println(getNome() + " - " + getSalario() + " - " + numFuncionarios);

    }
    
    @Override
    public void aumentaSalario(double porcentagem){
        // chama o método da superClasse
        super.aumentaSalario(porcentagem + 20);
    }

    @Override
    public String toString(){
        return super.toString() + " Numero Funcionario: " + numFuncionarios;
    }

}
