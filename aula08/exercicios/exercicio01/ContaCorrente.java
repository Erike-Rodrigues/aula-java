public class ContaCorrente extends Conta {

    final double TAXA_DEPOSITO = 0.1;
    
    public ContaCorrente(int numero){
        super(numero);
    }

    @Override
    public boolean saque(double valor) {
        if(valor <= getSaldo()){
            return super.saque(valor);
        }
        return false; // não tem saldo suficiente

    }

    @Override
    public boolean deposito(double valor){
        return super.deposito(valor - TAXA_DEPOSITO);
    }

    
    @Override
    public String toString(){
        return "Conta corrente " + super.toString();

    }


} //fim da classe
