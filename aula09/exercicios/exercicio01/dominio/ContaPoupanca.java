package exercicios.exercicio01.dominio;

public class ContaPoupanca extends Conta {
    //static define um atributo para a classe, e não para cada objeto.
    private static double taxa = 0.1;


    public ContaPoupanca(int numero){
        super(numero);
    }

    public static void setTaxa(double novaTaxa){
        if(novaTaxa > 0){
            taxa = novaTaxa;
        }

    }

    @Override
    public boolean saque(double valor) {
        if(valor + taxa <= getSaldo()){
            return super.saque(valor + taxa);
        }
        return false; // não tem saldo suficiente
    }

    @Override
    public String toString(){
        return "Conta poupança: " + super.toString() + " Taxa " + taxa;

    }
}
