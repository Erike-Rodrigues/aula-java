package exercicios.exercicio01.dao;

import java.util.ArrayList;

import exercicios.exercicio01.dominio.Conta;
import exercicios.exercicio01.dominio.ContaCorrente;
import exercicios.exercicio01.dominio.ContaEspecial;
import exercicios.exercicio01.dominio.ContaPoupanca;

public class GerenciaContas {
    private ArrayList<Conta> contas;

    public GerenciaContas(){
        contas = new ArrayList<>();
    }

    public void novaContaCorrente(int numeroConta) {
        contas.add(new ContaCorrente(numeroConta));
    }
    
    public void NovaContaEspecial(int numeroConta, double limite) {
        contas.add(new ContaEspecial(numeroConta, limite));
    }

    public void NovaContaPoupanca(int numeroConta){
        contas.add(new ContaPoupanca(numeroConta));
    }

    public boolean deposito(int numeroConta, double valor) {
        // procura a conta para realizar deposito
        for (Conta conta : contas) {
            if(conta.getNumero() == numeroConta) { // achou a conta
                return conta.deposito(valor);

            }
        }
        return false; //conta não encontrada.
    }

    public boolean saque(int numeroConta, double valor) {
        // procura a conta para realizar saque
        for (Conta conta : contas) {
            if(conta.getNumero() == numeroConta) { // achou a conta
                return conta.saque(valor);

            }
        }
        return false; //conta não encontrada.
    }

    public String saldo(int numeroConta){
        for (Conta conta : contas) {
            if(conta.getNumero() == numeroConta){
                return "" + conta;
            }
            
        }
        return "Conta não encontrada.";
    }

    
}
